package day04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

//  printWriter
public class Demo04 {
    public static void main(String[] args) {

        String adress="e:\\news2.txt";

        try {
      /*      PrintWriter pw =new PrintWriter(new FileWriter(adress));
            pw.print("华陆叔叔叔叔");
            pw.close();*/

            System.setOut(new PrintStream(adress));
            System.out.println("花里胡哨的");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}