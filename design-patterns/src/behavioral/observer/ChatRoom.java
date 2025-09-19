package behavioral.observer;

import java.util.ArrayList;

public class ChatRoom implements Subject {
    private ArrayList<Observer> observers;


    public ChatRoom(){
        observers = new ArrayList<>();
    }

    public ChatRoom(ArrayList<Observer> observers){
        this.observers = observers;
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        String message = String.valueOf(Message.REGISTERED);
        sendMessage(o, message);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
        String message = String.valueOf(Message.LOGGED_OUT);
        sendMessage(o, message);

    }

    @Override
    public void notifyObservers(Observer sender, String message) {
        for (Observer observer : observers) {
            if(sender != observer || !observers.contains(sender)) {
                observer.update(" received: <" + sender.getUsername() + "> " + message);
            }else{
                sender.update(" sent: " + message);
            }
        }

    }


    public void sendMessage(Observer sender, String messageContent) {

        notifyObservers(sender, messageContent);
    }
}
