public class Arrays6 {
    public static void main(String[] args) {
        int[] array={2, 4, 5, 76, 3, 4, 6, 6, 3, 4, 2, 43, 234, 342, 2, 3, 45, 23, 46};
        int i;
        for (i=0; i<array.length; i++){
            for (int j = i+1; j<array.length; j++)
                if (array[i] == array[j]) {
                int sum =array[i]+array[j];

                    System.out.println( sum);
                }
        }
    }


}
