package maxMin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Run {

    public static void main(String[] args) {

        int[] numbers = {9, 8, 7, 6, 22, 0, -125, 5, 4, 3, 2, 1};
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 22, 0, -125, 5, 4, 3, 2, 1));

        //maximum in collection
        System.out.println(Collections.max(numbersList));

        //maximum in array
        System.out.println(maximum(numbers));

        //maximum in array(Math Class)
        System.out.println(maximumSmartest(numbers));


    }

    static int minimum(int[] array) {
        int min = array[0];
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    static int minimumSmartest(int[] array) {
        int min = array[0];
        for (int number : array) {
            min = Math.max(min, number);
        }
        return min;
    }

    static int maximum(int[] array) {
        int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    static int maximumSmartest(int[] array) {
        int max = array[0];
        for (int number : array) {
            max = Math.max(max, number);
        }
        return max;
    }


}
