public class Strings7 {
    public static void main(String[] args) {
        String cap = "";
        String toAppercase = "Drunkards know no danger";
        String[] token = toAppercase.split("\\s+|\\.$");
        for (String current : token) {
            String first = String.valueOf(Character.toUpperCase(current.charAt(0)));
            String between = current.substring(1, current.length() - 1);
            String last = String.valueOf(Character.toUpperCase(current.charAt(current.length() - 1)));
            if (!cap.equals(" ")) {

                cap += " ";

                cap += first + between + last;
                System.out.print(cap);
            }
        }
    }
}
