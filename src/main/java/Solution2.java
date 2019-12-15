


public class Solution2 {
    static int var = 1;
    public static void main(String[] args) {
        while(var <= 10){
            for(int i = 1; i<=10; i++){
                int res = var*i;
                System.out.print(res + " ");
            }
            var++;
            System.out.println();
        }


    }
}
