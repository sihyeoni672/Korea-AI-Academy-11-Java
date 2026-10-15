package study01;
//1-1
import java.util.ArrayList;

public class Study04 {
    public static void main(String[] args) {
        Score.run();
    }
}

class Score {
    static void run() {
        ArrayList<Integer> score = new ArrayList<>();
        score.add(90);
        score.add(80);
        score.add(70);

        int sum = 0;

        for (int i = 0; i < score.size(); i++) {
            sum += score.get(i);
        }
        System.out.println("합계: " + sum);
    }
}
