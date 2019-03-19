package Sort;

import java.util.Arrays;

public class Popsort {
    public static void sort(int[] numbers) {
        int numberLength = numbers.length;
        int temp = 0;
        for (int i = 0; i < numberLength; i++) {
            for (int j = 0; j < numberLength - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("Popsort:"+ Arrays.toString(numbers));
    }
}
