package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return temperatureCelsius*9/5 +32;
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        return String.format("Current weather: %.1f °C (%.1f°F) and %s", temperatureCelsius,
                temperatureFahrenheit(), conditions);
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
       double temperatureCelsius = (tempFahrenheit - 32) *5/9;
        return new WeatherData(temperatureCelsius, conditions);
    }

    public static void main(String[] args) {
        WeatherData weatherData1 = new WeatherData(25.0, "Sunny");
        System.out.println(weatherData1.getSummary());

        System.out.print("\n");

        WeatherData weatherData2 = fromFahrenheit(50.0, "Cloudy");
        System.out.println(weatherData2.getSummary());

    }
}
