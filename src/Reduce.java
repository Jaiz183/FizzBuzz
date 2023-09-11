public class Reduce {

    public static void main(String[] args) {

        int numSteps = 0;
        int start = 100;

        while (start > 0) {
            if (start % 2 == 0) {
                start /= 2;
            } else {
                start--;
            }

            numSteps++;
        }

        System.out.println(numSteps);
    }
}
