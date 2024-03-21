import java.util.Scanner;
class Calculator implements Runnable {
    private int a, b;
    private String operation;
    public Calculator(int a, int b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }
    @Override
    public void run() {
        switch (operation) {
            case "add":
                System.out.println("Addition Result: " + (a + b));
                break;
            case "subtract":
                System.out.println("Subtraction Result: " + (a - b));
                break;
            case "multiply":
                System.out.println("Multiplication Result: "+ (a * b));
                break; 
            case "divide":
                if (b != 0)
                    System.out.println("Division Result: " + ((double) a / b));
                else
                    System.out.println("Cannot divide by zero.");
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
public class CalculatorThreads {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        Thread addThread = new Thread(new Calculator(num1, num2, "add"));
        Thread subtractThread = new Thread(new Calculator(num1, num2, "subtract"));
        Thread multiplyThread = new Thread(new Calculator(num1, num2, "multiply"));
        Thread divideThread = new Thread(new Calculator(num1, num2, "divide"));
        addThread.start();
        subtractThread.start();
        multiplyThread.start();
        divideThread.start();
        scanner.close();
    }
}