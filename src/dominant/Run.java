package dominant;

public class Run {

    public static void main(String[] args) {

        int[] array = {1, 2, 5, 6, 7, 8, 7, 55, 15};

        System.out.println(dominantInArray(array));
    }

    public static int dominantInArray(int[] array) {
        if (array.length == 0){
            return 0;
        }
        int min = minimum(array);
        int max = maximum(array);
        int[] helpArray = new int[max - min + 1];
        for (int i = 0; i < array.length; i++){
            helpArray[array[i] - min]++;
        }
        int occurrence = maximum(helpArray);
        int result = 0;
        for (int i = 0; i < helpArray.length; i++) {
            if (helpArray[i] == occurrence){
                result = i + min;
            }
        }
        return result;
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

    static int maximum(int[] array) {
        int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
