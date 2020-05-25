package Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution63 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i<10; i++){
            String s= reader.readLine();
            if (s == "read")
                break;
            list.add(s);
        }
        for (String word: list)
            System.out.println(word);

    }
}