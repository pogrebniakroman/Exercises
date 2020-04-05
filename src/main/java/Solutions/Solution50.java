package Solutions;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution50 {
    public static void main(String[] args) throws Exception {
        String [] list = new String[10];
        int [] num = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < list.length; i++ ){
            list[i] = reader.readLine();
        }
        for(int j = 0; j< num.length; j++){
            num[j] = list[j].length();
            System.out.println(num[j]);
        }
    }
}