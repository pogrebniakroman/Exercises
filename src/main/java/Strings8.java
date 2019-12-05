public class Strings8 {
    public static void main(String[] args) {
        String cap = "";
        String toAppercase = "Black souls wear white shirts";
        String[] token = toAppercase.split("\\s+|\\.$");
        for(String current : token){
            String first= String.valueOf(Character.toUpperCase(current.charAt(0)));
            String between = current.substring(1, current.length()-1);
            String second = String.valueOf(Character.toUpperCase(current.charAt(3)));
            String between2 = current.substring(1, current.length()-1);
            String last =  String.valueOf(Character.toUpperCase(current.charAt(current.length()-1)));
            if(!cap.equals(" ")){

                cap += " ";

                cap += first+between+second+between2+last;
                System.out.println(cap);
            }

        }
    }
}
