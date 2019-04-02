package creational.factory;

public class NormalPrinter implements IPrinter {
    @Override
    public void print() {
        System.out.println("Normal printer btw!");
    }

    @Override
    public boolean stop() {
        return false;
    }
}
