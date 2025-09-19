package behavioral.observer;

public class ObserverRunner {
    public static void main(String[] args) {

        ChatRoom chatRoom = new ChatRoom();
        User user1 = new User("John");
        User user2 = new User("Jane");
        User user3 = new User("Daniel");

        chatRoom.registerObserver(user1);
        chatRoom.registerObserver(user3);
        chatRoom.sendMessage(user1,"my first message");
        chatRoom.removeObserver(user3);

    }
}
