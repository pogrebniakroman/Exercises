
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solutions40 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double s = 0;
        int r = 0;
        while(true){
            int x=Integer.parseInt(reader.readLine());
            if(x==-1)break;
            r ++;
            s+=x;
        }
        double rs=s/(r);
        System.out.println(rs);
    }
}
