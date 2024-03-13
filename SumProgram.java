public class SumProgram {
    public static void main(String[] args) {
        int[] values = { 10, 51, 53, 39, 47, 44, 21 };

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int i = 0; i < values.length; i++) {
            if (values[i] > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = values[i];
            }

            else if (values[i] > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = values[i];
            }

            else if (values[i] > thirdLargest) {
                thirdLargest = values[i];
            }
        }

        int sum = secondLargest + thirdLargest;

        System.out.println("Sum of 2nd and 3rd largest numbers: " + sum);
    }
}
