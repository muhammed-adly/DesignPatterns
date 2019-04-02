package creational.factory;

public class FactoryTest {

    public static void main(String[] args) {
        IPrinter laserPrinter = PrinterFactory.getPrinterType("laser");
        if (laserPrinter != null) {
            laserPrinter.print();
        }

        IPrinter normalPrinter = PrinterFactory.getPrinterType("normal");
        if (normalPrinter != null) {
            normalPrinter.print();
        }
    }
}
