package com.company;

import java.io.IOException;
import java.util.Properties;

public class LoggerFactor {

    public Logger getFactory() {
        if (isFileLoggingEnabled())
            return new FileLogger();
        else
            return new ConsoleLogger();
    }

//    if fileLogging property is on then it will log with filLogging, if not default: ConsoleLogging
    public boolean isFileLoggingEnabled() {
        Properties p = new Properties();
        try {
            p.load(ClassLoader.getSystemResourceAsStream("Logger.properties"));
            String fileLoggingValue =
                    p.getProperty("FileLogging");
            if (fileLoggingValue.equalsIgnoreCase("ON") == true)
                return true;
            else
                return false;
        } catch (IOException e) {
            return false;
        }
    }
}
