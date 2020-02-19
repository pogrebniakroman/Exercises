public class Solution27 {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("f",55);
    }

    static class Person {
        String name;
        int age;
        public void initialize(String name, int age){
            this.name=name;
            this.age=age;
        }
    }
}
