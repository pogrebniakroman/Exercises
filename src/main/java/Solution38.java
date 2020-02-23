public class Solution38 {

    public static void main(String[] args) {
        Man man = new Man("VASYA", 5, "Street");
        Man man1 = new Man( "IVAN", 9, "House");
        System.out.println(man.name+" "+man.age+" "+man.address);
        System.out.println(man1.name+" "+man1.age+" "+man1.address);
        Woman woman = new Woman("FROSYA", 1, "Street");
        Woman woman1 = new Woman( "MARUSYA", 3, "House");
        System.out.println(woman.name+" "+woman.age+" "+woman.address);
        System.out.println(woman1.name+" "+woman1.age+" "+woman1.address);
    }
    public static class Man{
        String name;
        int age;
        String address;
        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman{
        String name;
        int age;
        String address;
        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;

        }

    }
}