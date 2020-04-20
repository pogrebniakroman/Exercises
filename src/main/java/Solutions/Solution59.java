package Solutions;
import java.util.ArrayList;
        import java.io.BufferedReader;
        import java.io.InputStreamReader;

public class Solution59 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i++){
            list.add(0,reader.readLine());}

        ArrayList<String> result = doubleValues(list);
        for(int i = list.size()-1; i >= 0; i--)
        {
            System.out.println(result.get(i));
        }
    }
    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for(int i = list.size()-1; i >= 0; i--)
        {
            list.add(i, list.get(i));

        }
        return list;
    }
}