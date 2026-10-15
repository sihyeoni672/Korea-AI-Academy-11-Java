package com.korai.study.ch12;

import java.util.ArrayList;

public class Practice01 {
    public static void main(String[] args) {
        int max = 0;
        double avg = 0.0;
        int sum = 0;

        ArrayList<Integer> score = new ArrayList<>();
        score.add(85);
        score.add(92);
        score.add(78);
        score.add(96);
        score.add(88);

        System.out.println("전체점수: " + score);
        //System.out.println(max);
        //System.out.println(avg);


        for (int i = 0; i < score.size(); i++) {
            //max = score.get(0);
            if (max < score.get(i)) {
                max = score.get(i);
            }
        }

        for (int i = 0; i < score.size(); i++) {
            sum += score.get(i);
        }
        avg = (double) sum / 5;

        System.out.println("평균점수: " + avg);
        System.out.println("최고점수: " + max);

    }
}
