package behavioral.observer;

public class ObserverTest {
    public static void main(String[] args) {
        MessageServer server = new MessageServer();


        //for DEMO, instantiating device connections locally
        Client device1 = new Client("device01");
        device1.registerToSubject(server);

        Client device2 = new Client("device02");
        device2.registerToSubject(server);

        Client device3 = new Client("device03");
        device3.registerToSubject(server);

        server.register(device1);
        server.register(device2);
        server.register(device3);

        server.postMessage("Hey there");
        server.postMessage("testing the notification !?");

        device1.onConnect();
        device2.onConnect();
        device3.onConnect();
    }
}
