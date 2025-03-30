public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        for (int i = number; i > 0; i /= 10) {
            int lastDigit = i % 10;
            if (lastDigit % 2 == 0) {  // Check if the digit is even
                sum += lastDigit;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Test cases:");
        System.out.println("Sum of even digits in 123456: " + getEvenDigitSum(123456));    // Output: 12 (2 + 4 + 6)
        System.out.println("Sum of even digits in 252: " + getEvenDigitSum(252));          // Output: 4 (2 + 2)
        System.out.println("Sum of even digits in 13579: " + getEvenDigitSum(13579));      // Output: 0 (no even digits)
        System.out.println("Sum of even digits in 2468: " + getEvenDigitSum(2468));        // Output: 20 (2 + 4 + 6 + 8)
        System.out.println("Sum of even digits in -123: " + getEvenDigitSum(-123));        // Output: -1 (invalid case)
        System.out.println("Sum of even digits in 0: " + getEvenDigitSum(0));              // Output: 0
    }
}
