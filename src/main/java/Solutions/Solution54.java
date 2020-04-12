package Solutions;
import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.ArrayList;

public class Solution54 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> s = new ArrayList<String>();
        for(int i = 0 ; i < 5; i++){
            s.add(reader.readLine());
        }
        for(int j = 0; j < 13; j++){
            s.add(0, s.remove(s.size()-1));
        }
        for(int k = 0; k <s.size(); k++){
            System.out.println(s.get(k));
        }
    }
}
