package Solutions;
import java.util.ArrayList;
public class Cat2 {

    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat2() {
    }

    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            cats.add(new Cat());
        }
        printCats();
    }

    public static void printCats() {
        for(int j =0; j<10; j++){
            System.out.println(Cat2.cats.get(j));
        }
    }
}