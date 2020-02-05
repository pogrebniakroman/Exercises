
public class Solution20 {
    public static void main(String[] args) {
        Cat cat = new Cat("S",1,2,3);
        Cat cat1 = new Cat("w",1,9,3);
        Cat cat2 = new Cat("D",1,6,3);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}