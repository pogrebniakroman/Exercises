
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution9 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        int num1=Integer.parseInt(a);
        int num2=Integer.parseInt(b);
        int num3= Integer.parseInt(c);
        int sum1=num1+num2;
        int sum2=num2+num3;
        int sum3=num1+num3;
        if(sum1>num3&&sum2>num1&&sum3>num2){
            System.out.println("Треугольник существует.");
        }
        if(sum1<=num3||sum2<=num1||sum3<=num2){
            System.out.println("Треугольник не существует.");
        }

    }
}
