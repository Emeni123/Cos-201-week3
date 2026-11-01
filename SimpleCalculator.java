import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                if (second == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    input.close();
                    return;
                }
                result = first / second;
                break;
            default:
                System.out.println("Error: Invalid operator.");
                input.close();
                return;
        }

        System.out.println(first + " " + operator + " " + second + " = " + result);
        input.close();
    }
}
