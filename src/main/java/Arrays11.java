public class Arrays11 {
    public static void main(String[] args) {
        int arr[] = {4, 8, 90, 0, 40, 32, 64, 22, 76};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
            int sumcp = sum / arr.length;
            System.out.println(sumcp);


        }
    }

