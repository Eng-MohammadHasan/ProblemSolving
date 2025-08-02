public class PrimeNumberChecker {

    // Problem: Check if a number is prime or not.
    // A prime number is a number greater than 1 that is not divisible by any other numbers 
    // except 1 and itself. For example, 29 is a prime number, but 30 is not.
    // 
    // Solution: Instead of checking for divisibility from 2 to n-1, we can optimize the check
    // by only checking up to the square root of the number. If a number is divisible by any 
    // number greater than its square root, then the corresponding factor must already be smaller 
    // than or equal to the square root. This reduces the number of checks we need to make.

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;  // Numbers less than or equal to 1 are not prime.
        }

        // Optimization: If n is 2, it's prime (the only even prime number).
        if (n == 2) {
            return true;
        }

        // Optimization: If n is even and greater than 2, it's not prime.
        if (n % 2 == 0) {
            return false;
        }

        // Check divisibility from 3 to the square root of n.
        // Using Math.sqrt(n) gives the square root, which reduces the number of checks.
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // If n is divisible by i, it's not prime.
            if (n % i == 0) {
                return false;
            }
        }

        // If no divisors were found, n is prime.
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        int[] numbers = {29, 30, 17, 100, 1, 2};

        // Print whether each number is prime or not
        for (int number : numbers) {
            System.out.println(number + " is prime: " + isPrime(number));
        }
    }
}
