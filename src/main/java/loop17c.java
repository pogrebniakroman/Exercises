import java.util.Scanner;

public class loop17c {
    public static void main(String[] args) {
        int size = 5;
        for (int j = 0; j < (size - 1); j++)
            System.out.print(" ");
        System.out.println("*");
        for (int j = 1; j < (size - 1); j++)
        {
            for (int k = 0; k < (size - 1 - j); k++)
                System.out.print(" ");
            System.out.print("*");
            for (int m = 0; m < 2*j-1; m++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int j = 0; j < size ; j++)
            System.out.print("* ");
        System.out.println(" ");
    }
}




