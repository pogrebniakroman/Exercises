
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solutions14 {


        public static void main(String[] args) throws Exception {
            BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
            int a= Integer.parseInt(reader.readLine());
            System.out.println(
                    a < 0 && a % 2 == 0 ? "отрицательное четное число"   :
                            a < 0 && a % 2 != 0 ? "отрицательное нечетное число" :
                                    a > 0 && a % 2 != 0 ? "положительное нечетное число"   :
                                            a > 0 && a % 2 == 0 ? "положительное четное число" : "ноль");//напишите тут ваш код

        }
    }


