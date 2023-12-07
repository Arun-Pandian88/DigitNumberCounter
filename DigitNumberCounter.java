import java.util.Scanner;

public class DigitNumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Get user input for the array elements
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Get user input for the digit to count
        System.out.print("Enter the digit to count: ");
        int digitToCount = scanner.nextInt();

        int count = countDigitNumbers(array, digitToCount);

        System.out.println("Count of " + digitToCount + "-digit numbers: " + count);

        scanner.close();
    }

    static int countDigitNumbers(int[] arr, int digit) {
        int count = 0;

        for (int num : arr) {
            if (countDigits(num) == digit) {
                count++;
            }
        }

        return count;
    }

    static int countDigits(int number) {
        int count = 0;

        // Handle the case when number is 0 separately
        if (number == 0) {
            return 1;
        }

        // Use a loop to count the digits
        while (number != 0) {

            number /= 10;
            count++;
        }

        return count;
    }

}
