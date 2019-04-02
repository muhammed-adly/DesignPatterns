package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MessageServer implements ISubject {

    List<IObserver> clients;
    String message;

    public MessageServer() {
        this.clients = new ArrayList<>();
        this.message = "";
    }

    @Override
    public void register(IObserver client) {
        if (!clients.contains(client)) {
            clients.add(client);
        }
    }

    @Override
    public void unregister(IObserver client) {
        clients.remove(client);
    }

    @Override
    public void notifyObservers(String message) {
        for (IObserver client : clients) {
            client.updateListener(message);
        }
    }

    public void postMessage(String message) {
        this.message = message;
        notifyObservers(message);
    }
}
