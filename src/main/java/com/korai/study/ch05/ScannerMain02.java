package com.korai.study.ch05;

import java.util.Scanner;

public class ScannerMain02 {
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);

        String name= a.next();
        String num=a.next();
        String adr=a.nextLine();

        System.out.println("이름:"+name);
        System.out.println("연락처:"+num);
        System.out.println("주소:"+adr);
    }

}
