package Solutions;
import java.util.ArrayList;
        import java.io.BufferedReader;
        import java.io.InputStreamReader;


public class Solution53 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++){
            String s = reader.readLine();
            list.add(0, s); }


        for(int i = 9; i >=0; i--){
            int j = list.size() - i - 1;
            System.out.println(list.get(j));
        }
    }
}
