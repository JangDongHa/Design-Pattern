package observer.example;

public interface Subject {
    void addListener(Listener listener);
    void deleteListener(Listener listener);
    void notifyListener();
}
