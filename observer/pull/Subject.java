package observer.pull;

// 등록, 삭제, 알림
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
