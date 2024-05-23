import java.util.Scanner;

public class JavaClass {
    public static void main(String[] args) {
        Scanner number1Scanner = new Scanner(System.in);
        Scanner operationScanner = new Scanner(System.in);
        Scanner number2Scanner = new Scanner(System.in);
        System.out.println("Enter 1st number: ");

        double number1 = number1Scanner.nextInt();

        System.out.println("Enter operation: ");

        String operation = operationScanner.nextLine();

        System.out.println("Enter 2nd number: ");

        double number2 = number2Scanner.nextInt();

        double solution = 0;

        if(operation.equals("+")) {
            solution = number1 + number2;
        }
        if(operation.equals("-")) {
            solution = number1 - number2;
        }
        if(operation.equals("*")) {
            solution = number1 * number2;
        }
        if(operation.equals("/")) {
            if(number1 + number2 == 0) {
                try {
                    Thread.sleep(3000);

                } catch(InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Now deleting System32...");
            }
            else {
                solution = number1 / number2;
            }

        }

        System.out.println(solution);
    }
}
