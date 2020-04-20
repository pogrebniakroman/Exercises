package Solutions;

import java.util.ArrayList;

public class Solution58 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        for(int i=0; i< list.size(); i++){
            list.add((i=i+1),"именно");
        }
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
