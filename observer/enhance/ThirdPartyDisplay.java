package observer.enhance;

import observer.enhance.product.Data;

public class ThirdPartyDisplay implements Observer, Display {
    private float pressure;
    private WeatherData weatherData;

    public ThirdPartyDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Third Party Display : 기압 " + pressure);
    }

    @Override
    public void update(Data data) {
        this.pressure = data.getPressure();
        display();
    }
}
