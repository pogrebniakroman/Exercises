
public class Solution39 {

    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog dog= new Dog("Back", 11, 44);
        Cat cat= new Cat("Tom", 13, 44);

    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog{
        String name;
        int height;
        int age;

        public Dog(String name,int height,int age){
            this.name=name;
            this.age=age;
            this.height=height;
        }
    }
    public static class Cat{
        String name;
        int height;
        int age;

        public Cat(String name,int height,int age){
            this.name=name;
            this.age=age;
            this.height=height;
        }
    }

}