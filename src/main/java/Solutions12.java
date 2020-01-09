import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solutions12 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String a=reader.readLine();
        String b=reader.readLine();
        String c=reader.readLine();
        int num1=Integer.parseInt(a);
        int num2=Integer.parseInt(b);
        int num3=Integer.parseInt(c);
        if(num1==num2){
            System.out.println("3");

        }
        if(num1==num3){
            System.out.println("2");

        }
        if(num2==num3){
            System.out.println("1");

        }


    }
}

