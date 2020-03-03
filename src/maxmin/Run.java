package maxmin;

import java.util.*;

public class Run {

    public static void main(String[] args) {

        int[] numbers = {9, 8, 7, 6, 22, 0, -125, 5, 4, 3, 2, 1};
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 22, 0, -125, 5, 4, 3, 2, 1));
        Set<Integer> integerSet = new HashSet<>(Arrays.asList(9, 8, 7, 6, 22, 0, -125, 5, 4, 3, 2, 1));

        System.out.println("hello");

        //maximum in set
        System.out.println(Collections.max(integerSet));

        //maximum in collection
        System.out.println(Collections.max(numbersList));

        //maximum in array
        System.out.println(maximum(numbers));

        //maximum in array(Math Class)
        System.out.println(maximumSmartest(numbers));

        //minimum in collection
        System.out.println(Collections.min(numbersList));

        //minimum in array
        System.out.println(minimum(numbers));

        //minimum in array(Math Class)
        System.out.println(minimumSmartest(numbers));



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
            min = Math.min(min, number);
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
