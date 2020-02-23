public class Cat30 {
    String name;
    int age;
    int weight;
    String address;
    String color;
    public Cat30 (String name){
        this.name = name;
        this.age = 6;
        this.weight = 7;
        this.color = "green";
    }
    public Cat30(String name,int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "red";
    }
    public Cat30(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 1;
        this.color = "white";
    }
    public Cat30(int weight,String color){
        this.age = 3;
        this.weight = weight;
        this.color = color;
    }
    public Cat30(int weight,String color, String address){
        this.age = 66;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}