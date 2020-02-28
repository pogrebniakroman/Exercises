
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution41 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String a=reader.readLine();
        double c=Double.parseDouble(a);
        double b=c%5.0;
        if(b>=0){
            if(b<3){
                System.out.println("зеленый");
            }
            else if(b >=3&& b<4){
                System.out.println("желтый");
            }
            if(b >= 4){
                System.out.println("красный");

            }
        }

    }
}