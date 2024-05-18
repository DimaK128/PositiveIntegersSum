public class SumOfIntegers {
    public static void main(String[] args) {
        int n = 9;
        int result = sum1toN(n);
        System.out.println("Sum of the first " + n + " positive integers is: " + result);
    }

    public static int sum1toN(int n) {
        // Base case: if n equals 1, return 1
        if (n == 1) {
            return 1;
        }

        // Recursive case: sum(n) = n + sum(n - 1)
        return n + sum1toN(n - 1);
    }
}
