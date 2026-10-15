package study01;

import java.lang.reflect.Array;
import java.util.ArrayList;

//1-3
public class Study06 {
    public static void main(String[] args) {
        List.run();
    }
}

class List {
    static void run() {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(55);
        List.add(91);
        List.add(73);
        List.add(100);

        int max = List.get(0);;

        for (int i = 0; i < List.size(); i++) {
            if (List.get(i) > max) {
                max = List.get(i);
            }
        }
        System.out.println("최고점수: " + max);
    }
}
