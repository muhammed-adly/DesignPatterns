package creational.singelton;

import java.util.LinkedList;
import java.util.Queue;

public class Logger {

    private static Logger logger;
    private static Queue<String> queue;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger != null) {
            logger = new Logger();
            queue = new LinkedList<>();
        }
        return logger;
    }

    public void addToQueue(String log) {
        queue.add(log);
    }

    public void outputQueue() {
        for (String log : queue) {
            System.out.println(log);
        }
    }
}
