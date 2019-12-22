
    import java.io.BufferedReader;
import java.io.InputStreamReader;

    public class Solution8 {
        public static void main(String[] args) throws Exception {
            BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
            String year= reader.readLine();
            int year1 = Integer.parseInt(year);
            if(year1%400==0||year1%4==0&&year1%100!=0){
                System.out.println("количество дней в году: 366 ");
            }
            else{
                System.out.println("количество дней в году: 365");}//напишите тут ваш код

        }
    }



