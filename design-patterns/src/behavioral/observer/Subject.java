package behavioral.observer;

//subject interface
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(Observer sender, String message);

}
