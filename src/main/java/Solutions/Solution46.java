package Solutions;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Solution46 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x[] = new int[5];
        for(int i=0; i<5; i++){
            x[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(x, 0, 5);
        for(int i = 0; i<5; i++){
            System.out.println(x[i]);
        }
    }
}