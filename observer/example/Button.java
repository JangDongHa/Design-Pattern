package observer.example;

import observer.example.data.Data;

import java.util.ArrayList;
import java.util.List;

public class Button implements Subject{
    List<Listener> listeners;
    Data data;

    public Button(){
        this.listeners = new ArrayList<>();
        this.data = new Data();
    }

    @Override
    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    @Override
    public void deleteListener(Listener listener) {
        listeners.remove(listener);
    }

    @Override
    public void notifyListener() {
        listeners.forEach(Listener::update);
    }

    public void clickEvent(Data data){
        this.data = data; // 이벤트에 따른 처리
        notifyListener(); // 이벤트 알림
    }
}
