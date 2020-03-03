package primarynumber;

public class Run {
    public static void main(String[] args) {

        System.out.println(isPrimaryNumber(8));

    }

    static boolean isPrimaryNumber(int number) {
        int lastIter = (int) Math.sqrt(number);

        for (int i = 2; i <= lastIter; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
