package com.company;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileLogger implements Logger  {
    @Override
    public void log(String dataLine) {
                DataOutputStream dos;
                String filename = "log.txt";
                dataLine = "\n" + dataLine;

                try {
                    dos = new DataOutputStream(new FileOutputStream(filename, true));
                    dos.writeBytes(dataLine);
                    dos.close();
                } catch (FileNotFoundException ex) {
                } catch (IOException ex){

                }
                }

    }

