package study01;
//0-1
import java.util.ArrayList;

public class Study01 {
    public static void main(String[] args) {
        Num.run();
    }
}

class Num{
    static void run(){
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);

        System.out.println(num);
    }
}





