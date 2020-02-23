public class Solution34 {


    public static void main(String[] args) {
        Cat cat = new Cat("Cat", 44,35,93);
        Cat cat1 = new Cat("Cat1", 22,33,95);
        Cat cat2 = new Cat("Cat2", 23,87,99);
        cat.fight(cat1);
        System.out.println();
        cat.fight(cat2);
        System.out.println();
        cat1.fight(cat2);
        System.out.println();//напишите тут ваш код
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0;
        }
    }
}