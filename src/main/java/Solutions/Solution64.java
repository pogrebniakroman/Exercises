package Solutions;


import java.util.Set;
        import java.util.HashSet;

public class Solution64 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        s.add ("арбуз");
        s.add ("банан");
        s.add ("вишня");
        s.add ("груша");
        s.add ("дыня");
        s.add ("ежевика");
        s.add ("женьшень");
        s.add ("земляника");
        s.add ("ирис");
        s.add ("картофель");
        for(String c:s)
            System.out.println(c);

    }
}