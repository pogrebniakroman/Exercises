package Solutions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution52 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[15];
        int chet = 0;
        int nechet = 0;
        for(int i = 0; i < 15; i++){
            num[i] = Integer.parseInt(reader.readLine());
            if(i%2 == 0)
                chet += num[i];
            else
                nechet += num[i];
        }
        if(nechet > chet){
            System.out.println("В домах с нечетными номерами проживает больше жителей.");}
        else{
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }

    }
}