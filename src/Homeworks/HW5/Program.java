package Homeworks.HW5;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        //Jetty jetty = new Jetty();
        //jetty.fillData();

        Dictionary dictionary = new Dictionary();
        dictionary.fillDictionary();
        //dictionary.show();
        dictionary.replaceWord();
    }
}
