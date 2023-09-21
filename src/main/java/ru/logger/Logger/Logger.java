package ru.logger.Logger;

import java.util.Date;

public class Logger {

    private static Logger logger;
    protected int num = 1;

    private Logger() {

    }

    public static Logger get() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    private Date timeStamp (){
        return new Date();
    }

    public void log(String msg) {
        System.out.println("[" + timeStamp() + " " + num++ + "] " + msg);
    }
}
