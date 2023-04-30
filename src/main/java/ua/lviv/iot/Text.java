package ua.lviv.iot;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Text {
    public static void main(String[] args) throws IOException {
        WordReverser wordReverser = new WordReverser();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("enter sentence");
            String sentence = in.readLine();
            System.out.println("enter length");
            int length = Integer.parseInt(in.readLine());
            String result = wordReverser.reverseWords(sentence, length);
            System.out.println(result);

        }
    }
}
