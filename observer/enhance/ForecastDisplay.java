package observer.enhance;

import observer.enhance.product.Data;

public class ForecastDisplay implements Observer, Display {
    private float temp;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Forecast Display : 온도 " + temp + "도");
    }

    @Override
    public void update(Data data) {
        this.temp = data.getTemp();
        display();
    }
}
