public class loop6 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++)
            System.out.print(i);
        for (int j = 10; j <= 10; j--) {
            if (j <10)

                System.out.print(j);
            if (j<=1)
                break;
        }
    }
}
