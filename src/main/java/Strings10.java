public class Strings10 {
    public static void main(String[] args) {
        String string = "Fools love not the wise; drunkards love not the sober.";
        char[] chars = string.toCharArray();
        int count = string.indexOf('o');
        if (count < string.length()) count++;{


            System.out.println(count);
        }
    }
}

