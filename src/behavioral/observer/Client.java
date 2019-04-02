package behavioral.observer;

import java.util.LinkedList;
import java.util.Queue;

public class Client implements IObserver {

    public Queue<String> messageQueue;
    private ISubject messageServer;
    String id;

    public Client(String id) {
        this.id = id;
        messageQueue = new LinkedList<>();
    }

    @Override
    public void updateListener(String message) {
        messageQueue.add(message);
    }

    @Override
    public void registerToSubject(ISubject subject) {
        messageServer = subject;
    }

    public void onConnect() {
        if (!messageQueue.isEmpty()) {

            for (String s : messageQueue) {
                System.out.println(id + "received " + s);
            }
            messageQueue.clear();
        }
    }
}
