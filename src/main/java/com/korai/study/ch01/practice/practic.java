package com.korai.study.ch01.practice;

public class practic {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        int c = 2;

        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}