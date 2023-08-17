package CodeChallange04;

public class Main {
    public static void main(String[] args) {
        //recursive Fibonacci
        int num1 = 8;
        System.out.println("Using Recursive Fibonacci(" + num1 + ") = " + recursiveFibonacci(num1));

        //Iterative Fibonacci
        int num2 = 10;
        System.out.println("Using Iterative Fibonacci(" + num2 + ") = " + iterativeFibonacci(num2));


    }

    //time complexity of O(2^n) because it recalculates the same values multiple times,
    //leading to an exponential growth in the number of function calls
    public static int recursiveFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    //time complexity of O(n) because it calculates the Fibonacci numbers in a bottom-up manner
    public static int iterativeFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int prev1 = 0;
        int prev2 = 1;
        int current = 0;
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        return current;
    }

}

// the iterative solution is preferred due to its much better performance,
// especially for larger values of n
// the recursive solution becomes impractical due to its exponential time complexity.
