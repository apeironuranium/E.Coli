package text;


import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.matches;

/**
 * Created by leral on 04.04.2017.
 */
public class text {
    public static void main (String[] args){
        System.out.println("Enter something : ");
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();
        boolean continuesWord = false;
        int words = 0;
        char[] input_raw = input.toCharArray();
        int letter = 0;
        for (int i = 0; i < input.length(); i++ ) {
            if (Character.isLetter(input_raw[i])){
                letter++;
                if (!continuesWord){
                    words++;
                    continuesWord = true;
                }
            }
            else {
                continuesWord = false;
            }
        }
        System.out.println(letter);
        System.out.println(words);
    }


}
