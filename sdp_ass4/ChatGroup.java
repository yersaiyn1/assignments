import java.util.ArrayList;
import java.util.List;

// Subject (Observable)
class ChatGroup {
    private List<Observer> observers = new ArrayList<>();
    private String groupName;

    public ChatGroup(String groupName) {
        this.groupName = groupName;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void sendMessage(String message) {
        System.out.println(groupName + " - Message sent: " + message);
        notifyObservers(message);
    }

    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(groupName);
        }
    }
}
