
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solutions13 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String c=reader.readLine();
        String d=reader.readLine();
        int a=Integer.parseInt(c);
        int b=Integer.parseInt(d);
        if(a>0&&b>0){
            System.out.println(1);
        }
        if(a<0&&b>0){
            System.out.println(2);
        }
        if(a<0&&b<0){
            System.out.println(3);
        }
        if(a>0&&b<0){
            System.out.println(4);
        }


    }
}
