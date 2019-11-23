import java.util.Arrays;

public class Arrays5 {
    public static void main(String[] args) {

        int[] array = {5, 4, 6, 8, 3, 23, 5, 67, 45, 4, 24, 6, 34};

       int sum=0;
        for (int i = 0; i < array.length; i++) {
            int a=array.length;
              if(a%2==0){
                  sum=sum+a;
              }


                System.out.println(sum);

            }
        }
    }

