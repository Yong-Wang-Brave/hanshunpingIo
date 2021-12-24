package day03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream01 {

    public static void main(String[] args) {
        String srcAdress="e:\\news2.dat";

        try {
            ObjectInputStream oi =new ObjectInputStream(new FileInputStream(srcAdress));

            System.out.println(oi.readInt());
            System.out.println(oi.readBoolean());
            System.out.println(oi.readChar());
            System.out.println(oi.readDouble());
           System.out.println(oi.readUTF());
            Object dog = oi.readObject();
            System.out.println(dog);
            Dog dog2 =(Dog)dog;
            System.out.println(dog2.getName());
         oi.close();



        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



}
