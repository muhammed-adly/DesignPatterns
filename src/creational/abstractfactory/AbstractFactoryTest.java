package creational.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        IFactory widerFactory = AbstractFactory.getFactory("ember");

        widerFactory.createCPU();
    }
}
