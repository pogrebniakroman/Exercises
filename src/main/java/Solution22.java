
import java.util.ArrayList;
public class Solution22 {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        String e = "e";
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        int f = list.size();
        System.out.println(f);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

