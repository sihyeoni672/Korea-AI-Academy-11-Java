package com.korai.study.ch12;

import java.util.ArrayList;
import java.util.List;

public class CollectionMain06 {
    public static void main(String[] args) {
        //A1.run();
        A6.run();

    }
}

class A1 {
    static void run() {
        ArrayList<String> strList = new ArrayList<>();
        // 값추가
        strList.add("데이터1");
        // 값 여러개 한번에 추가
        strList.addAll(List.of("데이터2", "데이터3", "데이터4"));  // 불변 list
        strList.addFirst("데이터5");
        strList.addLast("데이터6");
        strList.add(2, "데이터7");

        System.out.println(strList);
    }
}


class A2 {
    static void run() {
        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(List.of("데이터1", "데이터2", "데이터3", "데이터4"));  // 불변 list
        boolean isRemoved = strList.remove("데이터2");
        String removedObject = strList.remove(2);
        strList.addAll(List.of("데이터5", "데이터6", "데이터7", "데이터8"));
        strList.removeAll(List.of("데이터6", "데이터7"));


        System.out.println(strList);
    }
}

class A3 {
    static void run() {
        List<String> strList = List.of("데이터1", "데이터2", "데이터3");
        String data = strList.get(2);
        System.out.println(data);
    }
}

class A4 {
    static void run() {
        List<String> strList = List.of("데이터1", "데이터2", "데이터3");
        boolean isContained = strList.contains("데이터2");
        System.out.println(isContained);
        boolean isContained2 = strList.get(1).contains("2");
        System.out.println(isContained2);
    }
}


class A5 {
    static void run() {
        List<Integer> scoreList = List.of(85, 92, 78, 96, 88);
        double avg = 0.0;
        int max = 0;
        int sum = 0;

        for (int i = 0; i < scoreList.size(); i++) {
            sum += scoreList.get(i);
            if (scoreList.get(i) > max) {
                max = scoreList.get(i);
            }
        }
        avg = (double) sum / scoreList.size();

        System.out.println("전체점수: " + scoreList);
        System.out.println("평균점수: " + avg);
        System.out.println("최고점수: " + max);
    }
}

class A6 {
    static void run() {
        List<String> list = List.of("Java", "Python", "Java", "C++", "Python");
        List<String> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (newList.contains(list.get(i))) {
                continue;
            }
            newList.add(list.get(i));
        }
        System.out.println(list);
        System.out.println(newList);
    }
}
