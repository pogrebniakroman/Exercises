public class Strings3 {
    public static void main(String[] args) {
        String char1 = new String("A hungry wolf is stronger than a satisfied dog");
        char[] chars = char1.toCharArray();
        int a = 0;
        for (char i : chars)
            if (i == 'a')a++;
        if (a<=char1.length()){
            System.out.println(a);

        }
    }
}
