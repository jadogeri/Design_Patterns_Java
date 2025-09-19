package behavioral.observer;

public class User implements Observer {
    private String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void update(String message) {
        System.out.println(username + message);
    }
}
