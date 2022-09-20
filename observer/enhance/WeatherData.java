package observer.enhance;

import observer.enhance.product.Data;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private Data data; // 캡슐화를 진행하여 변경에 대비

    public WeatherData(){ // 처음 생성할 때 옵저버 리스트 메모리 생성
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(data));
    }

    public void measurementsChanged(){ // 갱신된 측정값을 받으면 옵저버들에게 알림
        notifyObservers();
    }

    public void setMeasurements(Data data){
        this.data = data;
        measurementsChanged();
    }

    public Data getTemp() {
        return data;
    }
}
