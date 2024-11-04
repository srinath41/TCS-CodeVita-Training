import java.util.Scanner;

public class temperatureconversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the temperature to convert: ");
        double temperature = scanner.nextDouble();
        
        System.out.println("Choose the conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        int choice = scanner.nextInt();
        double convertedTemperature;

        switch (choice) {
            case 1:
                convertedTemperature = (temperature * 9/5) + 32;
                System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
                break;
                
            case 2:
                convertedTemperature = (temperature - 32) * 5/9;
                System.out.println("Temperature in Celsius: " + convertedTemperature);
                break;
                
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
                break;
        }

        scanner.close();
    }
}
