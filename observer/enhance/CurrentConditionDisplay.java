package observer.enhance;

import observer.enhance.product.Data;

public class CurrentConditionDisplay implements Observer, Display {
    private float temp;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("현재 상태 : 온도 " + temp + "F, 습도 " + humidity + "%");
    }

    @Override
    public void update(Data data) {
        this.temp = data.getTemp();
        this.humidity = data.getHumidity();
        display();
    }

    public void removeSubject(){
        weatherData.removeObserver(this);
    }
}
