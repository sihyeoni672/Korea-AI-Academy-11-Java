package com.korai.study.ch05;

public class ControlMain3 {

    /*
    public static void main(String[] args) {
        String star = "";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                star += "*";
            }
            star += "\n";
        }

        System.out.println(star);
    }
    */

    /*public static void main(String[] args) {
        String star = "";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                star += "*";
            }
            star += "\n";
        }

        System.out.println(star);
    }*/

    /*public static void main(String[] args) {
        String star = "";
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 4 - i; j++) {
                star += " ";
            }

            for (int j = 0; j < i + 1; j++) {
                star += "*";
            }
            star += "\n";
        }
        System.out.println(star);
    }*/

    /*public static void main(String[] args) {
        String star = "";
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5 + i; j++) {
                star += " ";
            }

            for (int j = 0; j < 5 - i; j++) {
                star += "*";
            }
            star += "\n";
        }
        System.out.println(star);
    }*/

    public static void main(String[] args) {
        String star = "";
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5 + i; j++) {
                star += " ";
            }

            for (int j = 0; j < 5 - i; j++) {
                star += "*";
            }
            star += "\n";
        }
        System.out.println(star);
    }

}