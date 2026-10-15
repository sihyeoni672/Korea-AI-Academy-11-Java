package study01;
//0-2
import java.util.ArrayList;

public class Study02 {
    public static void main(String[] args) {

        Fruits.run();
    }
}

class Fruits{
    static void run(){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("포도");
        fruits.add("딸기");

        System.out.println("크기: "+fruits.size());
        System.out.println("첫 번째: "+fruits.get(0));
        System.out.println("마지막: "+fruits.get(3));
    }
}
