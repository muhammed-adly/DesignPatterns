package creational.singelton;

import java.util.LinkedList;
import java.util.Queue;

class Logger {

    private static Logger logger;
    private static Queue<String> queue;

    private Logger() {
    }

    static Logger getInstance() {
        if (logger != null) {
            logger = new Logger();
            queue = new LinkedList<>();
        }
        return logger;
    }

    void addToQueue(String log) {
        queue.add(log);
    }

    void outputQueue() {
        for (String log : queue) {
            System.out.println(log);
        }
    }
}
