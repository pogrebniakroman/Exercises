package Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution49 {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            double result = weight/(height*height);
            if(result<18.5){
                System.out.println("Недовес: меньше чем 18.5");
            }
            if(result>18.5&&result<25){
                System.out.println("Нормальный: между 18.5 и 25");
            }

            if(result>25&&result<30){
                System.out.println("Избыточный вес: между 25 и 30");
            }
            if(result>30){
                System.out.println("Ожирение: 30 или больше");
            }
        }
    }
}