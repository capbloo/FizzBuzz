public class Multiples {
    public static void main(String[] args) {
        int threshold = 1000;
        int[] divisors = {3, 5};

        System.out.println(checkDivisibility(threshold, divisors));
    }

    private static int checkDivisibility(int threshold, int[] divisors) {
        int counter = 0;

        for (int i = 1; i <= threshold; i++) {
            boolean divisible = false;
            for (int divisor : divisors) {
                if ((i % divisor) == 0) {
                    divisible = true;
                }
            }
            if (divisible) counter++;
        }

        return counter;
    }
}
