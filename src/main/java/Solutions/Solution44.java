package Solutions;

public class Solution44 {

    public static void main(String[] args) {
        for(int i = 0; i<50000; i++){
            Cat cat= new Cat();}

        for(int i = 0; i<50000; i++){
            Dog dog = new Dog();}

    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}