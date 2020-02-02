

public class Solutions16 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        while(x<=10){
            while(y<=10){
                System.out.print(x*y + " ");
                y++;
            }
            System.out.println();
            x++;
            y=1;
        }

    }
}


