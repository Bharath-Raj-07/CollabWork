import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Functions f1 = new Functions();
        int n = 10;
        ArrayList<Integer> primeList = f1.generatePrimes(n);

        System.out.println("First " + n + " prime numbers are:");
        for (int prime : primeList) {
            System.out.print(prime + " ");
        }

    }
}