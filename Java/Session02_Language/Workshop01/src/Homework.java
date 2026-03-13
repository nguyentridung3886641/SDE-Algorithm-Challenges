import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        int n, a, b;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); a = sc.nextInt(); b = sc.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        }
        else {
            System.out.println(n + " is not a prime number.");
        }
        System.out.println("All prime numbers in the range of " + a + " to " + b + " is:");
        primeInRange(a, b);
        first1000Prime();
        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void primeInRange(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void first1000Prime() {
        int primeCount = 0, n = 2;
        while (primeCount < 1000) {
            if (isPrime(n)) {
                System.out.print(n + " ");
                if (primeCount >= 10 && primeCount % 10 == 0) {
                    System.out.println();
                }
                ++primeCount;
            }
            n++;
        }
        System.out.println();
    }
}
