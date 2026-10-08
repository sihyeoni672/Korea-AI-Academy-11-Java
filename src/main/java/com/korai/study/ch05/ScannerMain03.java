package com.korai.study.ch05;

import java.util.Scanner;

public class ScannerMain03 {
    public static void main(String[] args) {
        int[] num = new int[0];
        Scanner a = new Scanner(System.in);

        //int sum=0;
        while (true) {
            System.out.print("계속 추가하시겠습니까? (y/n): ");
            if (a.nextLine().equalsIgnoreCase("y")) {
                System.out.print("입력: ");
                int b = Integer.parseInt(a.nextLine());  //문자열 배열을 int로 바꾼다

                int[] num1 = new int[num.length + 1];
                for (int i = 0; i < num.length; i++) {
                    num1[i] = num[i];
                }
                num1[num1.length - 1] = b;
                num = num1;

            } else if (a.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("합계: " + sum);
    }
}
