import java.util.Arrays;

public class Arrays5 {
    public static void main(String[] args) {

        int[] array = {5, 4, 6, 8, 3, 23, 5, 67, 45, 4, 24, 6, 34};
        boolean k;
        for (int i = 0; i < array.length; i++){
            if ((k = (i % 2) == 0)) {
            } else {array[i]+=(array[i]);}

            System.out.println(array[i]);

            }
    }
}


