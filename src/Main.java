import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperatureConverter converter = new TemperatureConverter();
        int option;

        do {
            System.out.println("\n=== Temperature Converter ===");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Celsius to Kelvin");
            System.out.println("3. Convert Fahrenheit to Celsius");
            System.out.println("4. Convert Fahrenheit to Kelvin");
            System.out.println("5. Convert Kelvin to Celsius");
            System.out.println("6. Convert Kelvin to Fahrenheit");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            if (option >= 1 && option <= 6) {
                System.out.print("Enter the temperature value: ");
                double temperature = scanner.nextDouble();
                double result = converter.convertTemperature(option, temperature);
                System.out.printf("Converted temperature: %.2f%n", result);
            } else if (option != 7) {
                System.out.println("Invalid option. Please try again.");
            }
        } while (option != 7);

        System.out.println("Thank you for using the Temperature Converter!");
        scanner.close();
    }
}
