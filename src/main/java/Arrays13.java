public class Arrays13 {
    public static void main(String[] args) {
        int [] array = {4, 5, 7, 4, 33, 66, 54, 3, 3, 7, 8, 0, 24, 5, 43};
        for(int i = 0; i<array.length; i++){
            int sqrt= (int) Math.pow(array[i],2);
            System.out.print(sqrt +",");
        }

    }
}
