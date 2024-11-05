import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Choose the operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();
        double result;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result of Addition: " + result);
                break;
                
            case 2:
                result = num1 - num2;
                System.out.println("Result of Subtraction: " + result);
                break;
                
            case 3:
                result = num1 * num2;
                System.out.println("Result of Multiplication: " + result);
                break;
                
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result of Division: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
                
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                break;
        }

        scanner.close();
    }
}
