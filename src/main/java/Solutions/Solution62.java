package Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Solution62 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < N; i++){
            list.add(reader.readLine());
        }
        for (int i = 0; i < M; i++) {
            String s = list.get(0);
            list.remove(0);
            list.add(s);
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
