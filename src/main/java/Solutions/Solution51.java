package Solutions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution51 {
    public static void main(String[] args) throws Exception {
        int [] num = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < num.length; i++){
            num [i] = Integer.parseInt(reader.readLine());
        }
        int [] num1 = new int[10];
        for(int j = 0; j < 10; j++ ){
            num1[j] = num [j];
        }
        int [] num2 = new int[10];
        for(int m=10; m<20; m++){
            num2[m-10] = num [m];
            System.out.println(num[m]);
        }

    }
}
