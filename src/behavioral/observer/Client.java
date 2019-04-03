package behavioral.observer;

import java.util.LinkedList;
import java.util.Queue;

public class Client implements IObserver {

    private Queue<String> messageQueue;
    private ISubject messageServer;
    private String id;

    Client(String id) {
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

    void onConnect() {
        if (!messageQueue.isEmpty()) {

            for (String s : messageQueue) {
                System.out.println(id + "received " + s);
            }
            messageQueue.clear();
        }
    }
}
