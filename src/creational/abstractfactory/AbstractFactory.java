package creational.abstractfactory;

abstract class AbstractFactory {

    private static final EmberToolkit emberToolkit = new EmberToolkit();
    private static final EnginolaToolkit enginolaToolkit = new EnginolaToolkit();

    static IFactory getFactory(String architecture) {
        switch (architecture) {
            case "enginola":
                return enginolaToolkit;
            case "ember":
                return emberToolkit;
        }
        return null;
    }
}
