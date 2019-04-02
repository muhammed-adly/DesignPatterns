package creational.factory;

public class LaserPrinter implements IPrinter {

    @Override
    public void print() {
        System.out.println("Laser printer btw!");
    }

    @Override
    public boolean stop() {
        return false;
    }
}
