package com.example.schoolfx.logic;


import java.io.*;
import java.util.ArrayList;

public class IOLogic {

    public static void writeToFile() throws IOException {
        FileOutputStream file = new FileOutputStream("src\\main\\java\\com\\example\\schoolfx\\output\\file.ser");
        ObjectOutputStream out = new ObjectOutputStream(file);

        out.writeObject(ValuesNeedeForAll.classes);

        out.flush();
        file.flush();

        out.close();
        file.close();
    }

    public static void readFromFile() throws IOException, ClassNotFoundException {
      try {
          FileInputStream file = new FileInputStream("src\\main\\java\\com\\example\\schoolfx\\output\\file.ser");
          ObjectInputStream in = new ObjectInputStream(file);

          ValuesNeedeForAll.classes = (ArrayList<Class>) in.readObject();
          in.close();
          file.close();
      }catch (Exception e){

      }
    }
}
