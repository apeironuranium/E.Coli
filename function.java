package function;

import java.util.Scanner;

/**
 * Created by leral on 04.04.2017.
 */
public class function {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();
        char[] input_raw = input.toCharArray();

        int unmatchedBrackets = 0;
        for (int i = 0; i < input.length(); i++ ) {
            if (input_raw[i] == '(') {
                unmatchedBrackets++;
            }
            if (input_raw[i]==')'){
                unmatchedBrackets--;
                if(unmatchedBrackets<0){
                    break;
                }
            }
        }

        if(unmatchedBrackets==0){
            System.out.println("Well done");
        }
        else
        {
            System.out.println("It's wrong");
        }
        System.out.println(unmatchedBrackets);
        }

    }

