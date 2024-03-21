import java.util.Scanner;

public class PrimeChecker implements Runnable {
    private final int number;

    public PrimeChecker(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        boolean isPrime = isPrime(number);
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check for prime: ");
        int inputNumber = scanner.nextInt();
        scanner.close();

        PrimeChecker primeChecker = new PrimeChecker(inputNumber);
        Thread thread = new Thread(primeChecker);
        thread.start();
    }
}