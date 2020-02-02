

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solutions15 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d=0;

        if(a>0)d++;
        if(b>0)d++;
        if(c>0)d++;
        System.out.println(d);

    }
}