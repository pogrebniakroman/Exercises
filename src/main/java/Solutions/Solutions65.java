package Solutions;


import java.util.*;

public class Solutions65 {
    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<>();
        Human ded = new Human("Ivan",  true, 65 );
        list.add(ded);
        Human baba = new Human(" Valya", false, 88);
        list.add(baba);
        Human ded1 = new Human("Vasya", true, 55);
        list.add(ded1);
        Human babka = new Human("Dunya", false, 88);
        list.add(babka);

        Human pikus = new Human("Syapa", true, 44, ded, baba);
        list.add(pikus);
        Human child = new Human("Chiza", true, 55, ded1, baba);
        list.add(child);
        Human child1= new Human("Hren", true, 22, ded1, babka);
        list.add(child1);
        Human child2 = new Human("Chiza", false, 52, ded1, baba);
        list.add(child2);
        Human child3= new Human("Hren", true, 22, ded1, babka);
        list.add(child3);
        for (Human i: list){
            System.out.println(i);
        }

    }

    public static class Human{
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this(name,sex, age);
            this.father = father;
            this.mother = mother;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}