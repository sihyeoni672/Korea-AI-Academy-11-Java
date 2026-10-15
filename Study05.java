package study01;
//1-2
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Study05 {
    public static void main(String[] args) {
        Nums.run();
    }
}

class Nums {
    static void run() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(90);
        nums.add(85);
        nums.add(70);

        double avg = 0;
        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        avg = sum / (double)nums.size();

        System.out.println(avg);
    }
}

