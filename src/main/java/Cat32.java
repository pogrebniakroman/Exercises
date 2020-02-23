public class Cat32 {
        String name;
        public int age;
        public int weight;
        public String address;
        public String color;
        public void initialize(String name){
            this.name = name;
            this.age = 3;
            this.weight = 77;
            this.color = "red";
        }
        public void initialize(String name, int weight, int age){
            this.name = name;
            this.weight = weight;
            this.age = age;
            this.color = "white";
        }
        public void initialize(String name, int age){
            this.name = name;
            this.weight = 5;
            this.age = age;
            this.color = "white";
        }
        public void initialize( int weight, String color){
            this.weight = weight;
            this.age = 1;
            this.color = color;
        }
        public void initialize( int weight, String color,String address){
            this.weight = weight;
            this.age = 5;
            this.color = color;
            this.address = address;

        }
        public static void main(String[] args) {

        }
    }

