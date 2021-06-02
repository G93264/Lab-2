package com.company;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String dataLine){
        System.out.println(dataLine);
    }
}
