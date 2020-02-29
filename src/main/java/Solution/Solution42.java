package Solution;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution42 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int f = Integer.parseInt(reader.readLine());
        int minimum = min(a, b, c, d, f);
        System.out.println("Minimum = " + minimum);
    }
    public static int min(int a, int b, int c, int d, int f) {
        int e = a<b?a:b;
        int g = c<d?c:d;
        int h = e<g?e:g;
        if(f<h) return f;
        else return h;
    }
}