package behavioral.observer;

public interface ISubject {
    public void register(IObserver client);

    public void unregister(IObserver client);

    public void notifyObservers(String message);
}
