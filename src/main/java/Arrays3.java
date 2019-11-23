import java.lang.reflect.Array;

public class Arrays3 {
    public static void main(String[] args) {
     int [] array = {3,3,3,3,4,4,4,4};
     int [] array2 = {5, 4, 6, 8, 3, 23, 5, 67, 45, 4, 24, 6, 34};
     int sum = 0;
     for(int i=0; i<array2.length; i++){
         sum=sum+array2[i];
     }
        System.out.println(sum);
    }
}
