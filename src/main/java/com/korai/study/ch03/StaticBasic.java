package com.korai.study.ch03;

import java.time.LocalDate;

public class StaticBasic {
    public static void main(String[] args) {
        Student s1 = 학생관리시스템.학생추가("이시현");
        Student s2 = 학생관리시스템.학생추가("김시현");
        Student s3 = 학생관리시스템.학생추가("최시현");
    }
}

class Student {
    int code;
    String name;

    Student(int code, String name) {
        // 힘 메모리를 빌려서 객체를 생성 및 할당
        System.out.println("생성자 호출");
        this.name = name;
        this.code = code;
    }
}

class 학생관리시스템 {
    static int year = LocalDate.now().getYear();
    static int num = 1;

    static {
        System.out.println("학생관리시스템 클래스 로딩");
    }

    static Student 학생추가(String name) {
        return new Student(year * 10000 + num++, name);
    }
}
