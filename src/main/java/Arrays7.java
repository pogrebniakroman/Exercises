public class Arrays7 {
    public static void main(String[] args) {
        int array []={3, 4, 5, 6, 3, 2, 5, 7, 8};
        int mult = 1;
        for(int i=0; i<array.length; i++ )
            mult= mult*array[i];
        System.out.println(mult);
    }
}
