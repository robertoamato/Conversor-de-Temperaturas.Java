public class TemperatureConverter {
    public double convertTemperature(int option, double value) {
        switch (option) {
            case 1: // Celsius to Fahrenheit
                return (value * 9 / 5) + 32;
            case 2: // Celsius to Kelvin
                return value + 273.15;
            case 3: // Fahrenheit to Celsius
                return (value - 32) * 5 / 9;
            case 4: // Fahrenheit to Kelvin
                return (value - 32) * 5 / 9 + 273.15;
            case 5: // Kelvin to Celsius
                return value - 273.15;
            case 6: // Kelvin to Fahrenheit
                return (value - 273.15) * 9 / 5 + 32;
            default:
                throw new IllegalArgumentException("Invalid conversion option");
        }
    }
}
