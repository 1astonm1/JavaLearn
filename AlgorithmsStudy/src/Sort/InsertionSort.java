package Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] numbers){
        int numberLength = numbers.length;
        int key = 0;
        int i = 0;
        for(int j=1;j<numberLength;j++){
            key = numbers[j];
            i = j - 1;
            while((i>=0)&&(numbers[i]>key)){
                numbers[i+1] =numbers[i];
                i = i - 1;
            }
            numbers[i+1] = key;
        }
        System.out.println("InsertionSort:"+ Arrays.toString(numbers));
    }
}
