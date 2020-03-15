package Solutions;


public class Solution48 {
    public static int min(int a, int b, int c, int d) {
        int q=0;
        int e = min(a, b);
        if(e<c&&e<d) q = e;
        if(c<e&&c<d) q = c;
        if(d<c&&d<e) q = d;
        return q;

    }

    public static int min(int a, int b) {
        if(a < b)
            return a;
        else return b;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}