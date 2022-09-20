package observer.enhance;

import observer.enhance.product.Data;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        ThirdPartyDisplay thirdPartyDisplay = new ThirdPartyDisplay(weatherData);


        weatherData.setMeasurements(new Data(80, 65, 30.4f));
        weatherData.setMeasurements(new Data(82, 70, 29.2f));
        currentConditionDisplay.removeSubject();
        weatherData.setMeasurements(new Data(78, 90, 29.2f));
    }
}
