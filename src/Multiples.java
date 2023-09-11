public class Multiples {

    public static void main(String[] args) {
        int numMultiples = 0;

        for (int i = 1; i < 1000; i++) {
            boolean isDivisibleBy3 = i % 3 == 0;
            boolean isDivisibleBy5 = i % 5 == 0;

            if (isDivisibleBy3 || isDivisibleBy5) {
                numMultiples++;
            }
        }

        System.out.println(numMultiples);


    }

}
