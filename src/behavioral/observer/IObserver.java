package behavioral.observer;

public interface IObserver {

    public void updateListener(String payload);

    public void registerToSubject(ISubject sub);
}
