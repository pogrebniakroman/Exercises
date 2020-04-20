package Solutions;

import java.io.IOException;
        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.ArrayList;

public class Solution56 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = "", b = "";
        int ind1 = 0, ind2 = 0;
        for(int i = 0; i < 10; i++){
            list.add(reader.readLine());
        }
        int kor = list.get(0).length();
        int dlin = list.get(0).length();


        for (int i = 0; i < 10; i++) {
            if (kor > list.get(i).length()){
                kor = list.get(i).length();
                ind1 = i;
            }

            else {
                if (dlin < list.get(i).length()){
                    dlin = list.get(i).length();
                    ind2 = i;
                }
            }
        }
        if (ind1<ind2){
            System.out.println(list.get(ind1));
        }
        else{
            System.out.println(list.get(ind2));
        }

    }
}
