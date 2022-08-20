package observer.enhance;

import observer.enhance.product.Data;

public class StatisticDisplay implements Observer, Display {
    private float humidity;
    private WeatherData weatherData;

    public StatisticDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Statistic Display : 습도 " + humidity + "%");
    }

    @Override
    public void update(Data data) {
        this.humidity = data.getHumidity();
        display();
    }
}
