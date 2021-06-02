package com.company;

public class Main {
    public static void main(String[] args) {
        LoggerFactor factory = new LoggerFactor();
        Logger logger = factory.getFactory();
        logger.log("hello");
        logger.log("How Are you?");
    }
}
