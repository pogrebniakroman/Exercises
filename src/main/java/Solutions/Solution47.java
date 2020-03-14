package Solutions;
        import java.io.IOException;
        import java.io.BufferedReader;
        import java.io.InputStreamReader;


public class Solution47 {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int x[] = new int[20];
        for(int i = 0; i<20; i++){
            x[i] = Integer.parseInt(reader.readLine());
        }
        return x;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if(max<array[i])
                max = array[i];
        }
        return max;
    }
}
