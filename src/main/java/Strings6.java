public class Strings6 {
    public static void main(String[] args) {
        String cap = "";
        String toAppercase = "Fire begins with sparks";
        String[] token = toAppercase.split("\\s+|\\.$");
        for (String current : token) {
            String first = String.valueOf(Character.toUpperCase(current.charAt(0)));
            String between = current.substring(1, current.length()-1);
            if(!cap.equals("")){
                cap += "";
            }
            System.out.print(first+between+" ");
        }
    }
}
