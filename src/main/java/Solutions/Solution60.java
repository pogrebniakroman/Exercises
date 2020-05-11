package Solutions;
        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.ArrayList;

public class Solution60 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            int b = Integer.parseInt(reader.readLine());
            list.add(b);}
        for(int b = 9; b >= 0; b--){
            System.out.println(list.get(b));
        }

    }
}