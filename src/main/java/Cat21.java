public class Cat21 {

    public int age;
    public int weight;
    public int strength;

    public Cat21() {
    }

    public boolean fight(Cat21 anotherCat) {
        int a = 0, b = 0;
        if(this.age>anotherCat.age)a++;
        else if(this.age<anotherCat.age)b++;
        if(this.weight>anotherCat.weight)a++;
        else if(this.weight<anotherCat.weight)b++;
        if(this.strength>anotherCat.strength)a++;
        else if(this.strength<anotherCat.strength)b++;
        if(a>b)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {

    }
}