
    import java.io.BufferedReader;
import java.io.InputStreamReader;

    public class Solution7 {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String a =reader.readLine();
            int day=Integer.parseInt(a);
            if(day==1){
                System.out.println("понедельник");
            }
            if(day==2){
                System.out.println("вторник");
            }
            if(day==3){
                System.out.println("среда");
            }
            if(day==4){
                System.out.println("четверг");
            }
            if(day==5){
                System.out.println("пятница");
            }
            if(day==6){
                System.out.println("суббота");
            }
            if(day==7){
                System.out.println("воскресенье");
            }
            if(day<1||day>7){
                System.out.println("такого дня недели не существует");
            }
            //напишите тут ваш код

        }
    }

