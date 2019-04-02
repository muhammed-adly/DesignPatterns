package creational.factory;

public class PrinterFactory {

    public static IPrinter getPrinterType(String type) {
        switch (type) {
            case "laser":
                return new LaserPrinter();
            case "normal":
                return new NormalPrinter();
            default:
                return null;
        }
    }
}
