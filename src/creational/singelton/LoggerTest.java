package creational.singelton;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.addToQueue("adly");
        logger.addToQueue("any other log");

        logger.outputQueue();

        // let's define it again

        Logger logger2 = Logger.getInstance();
        logger2.addToQueue("a new instance!");

        logger2.outputQueue();
    }
}
