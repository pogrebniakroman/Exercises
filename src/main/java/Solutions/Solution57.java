package Solutions;


import java.util.ArrayList;

        import java.io.*;


public class Solution57 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 20; i++){
            String s = reader.readLine();
            int j = Integer.parseInt(s);
            list.add(j);
            if(j%3 == 0){
                list1.add(j);
            }
            if(j%2 == 0){
                list2.add(j);
            }
            if(j%2 != 0 && j%3 !=0){
                list3.add(j);
            }
        }


        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(ArrayList<Integer> list) {
        for(int i: list){
            System.out.println(i);
        }
    }
}