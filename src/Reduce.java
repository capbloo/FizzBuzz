public class Reduce {
    public static void main(String[] args) {
        int numToReduce = 100;
        int counter = 0;

        while (numToReduce > 0) {
            numToReduce = reduce(numToReduce);
            counter++;
        }

        System.out.println(counter);
    }

    private static int reduce(int numToReduce) {
        if (numToReduce % 2 == 0) {
            return numToReduce/2;
        }
        else return numToReduce-1;
    }
}
