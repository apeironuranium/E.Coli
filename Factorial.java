package fact;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by leral on 28.03.2017.
 */
public class Factorial {
    public static void main (String[] args) {

        int n = 0;
        try {
            BufferedReader reader;
            reader = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(reader.readLine());
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("You can't do this");
        }

        if (n<0){
            System.out.println("Enter not negative number");
        }
        else {
            int res = 1;
            for (int i=1; i<n+1; i++){
                res = res * i;
            }
            System.out.print(res);
        }
    }
}
