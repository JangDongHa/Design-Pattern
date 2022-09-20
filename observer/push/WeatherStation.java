package observer.push;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(); // subject

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData); // observer
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData); // observer
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData); // observer
        ThirdPartyDisplay thirdPartyDisplay = new ThirdPartyDisplay(weatherData); // observer

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
