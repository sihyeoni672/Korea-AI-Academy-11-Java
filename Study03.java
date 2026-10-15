package study01;
//0-3
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Study03 {
    public static void main(String[] args) {
        Fruit.run();
    }
}

class Fruit {
    static void run() {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("사과");
        fruit.add("바나나");
        fruit.add("포도");
        fruit.add("딸기");

        for (int i = 0; i < fruit.size(); i++) {
            System.out.println(i + ": " + fruit.get(i));
        }
    }
}
