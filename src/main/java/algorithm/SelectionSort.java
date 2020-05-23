package algorithm;

import java.util.Arrays;

public class SelectionSort {

    int[] input = {8,3,1 , 5, 4, 6};
    int[] expected = {1, 3, 4, 5, 6, 8};

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.run();
    }

    public void run() {
        for (int i = 0; i < input.length-1; i++) {
            int minValuedIndex = i;

            for (int j = i +1 ; j < input.length; j++) {
                if (input[minValuedIndex] > input[j]) {
                    minValuedIndex = j;
                }
            }

            if (minValuedIndex != i){
                int temp = input[i];
                input[i]= input[minValuedIndex];
                input[minValuedIndex] = temp;
                System.out.println(Arrays.toString(input));
            }

        }

        System.out.println(Arrays.equals(input, expected));
        System.out.println(Arrays.toString(input));

    }
}
