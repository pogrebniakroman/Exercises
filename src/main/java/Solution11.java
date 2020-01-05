import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution11 {

        public static void main(String[] args) throws Exception {
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));  //напишите тут ваш код
            String a=reader.readLine();
            String b=reader.readLine();
            String c=reader.readLine();
            int num1=Integer.parseInt(a);
            int num2=Integer.parseInt(b);
            int num3=Integer.parseInt(c);
            if(num1>=num2&&num1>=num3&&num2>=num3){
                System.out.println(num1+" "+num2+" "+num3);
            }
            if(num2>=num1&&num2>=num3&&num1>=num3){
                System.out.println(num2+" "+num1+" "+num3);
            }
            if(num3>=num2&&num3>=num1&&num2>=num1){
                System.out.println(num3+" "+num2+" "+num1);
            }
            if(num3>=num1&&num3>=num2&&num1>=num2){
                System.out.println(num3+" "+num1+" "+num2);

            }
            if(num1>=num2&&num3>=num2&&num1>=num3){
                System.out.println(num1+" "+num3+" "+num2);
            }
            if(num2>=num1&&num2>=num3&&num3>=num1){
                System.out.println(num2+" "+num3+" "+num1);
            }
        }
    }


