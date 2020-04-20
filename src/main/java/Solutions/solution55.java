package Solutions;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class solution55 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> s = new ArrayList<String>();
        for(int i = 0; i < 5; i++)
            s.add(new BufferedReader(new InputStreamReader(System.in)).readLine());
        s.remove(2);
        for(int i = s.size()-1; i >= 0; i--){
            System.out.println(s.get(i));
        }

    }
}
