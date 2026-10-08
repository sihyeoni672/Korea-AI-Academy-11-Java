package com.korai.study.ch01.practice;

public class Operator {
    public static void main(String[] args) {
        // 논리 연산자
        // T=1=흐른다
        // F=0=흐르지 않는다
        // 곱=그리고=AND=&&
        // 합=또는=OR=||
        // 부정=반전=NOT=!

        // 합=> 1+1=2
        // 합=> 흐른다+흐른다=흐른다, 흐른다+안 흐른다=흐른다
        // 합=> T||T=T, T||F=T

        // 곱=> 1*1=1, 1*0=0
        // 곱=> T&&T=T, T&&F=F

        boolean open1 = true;
        boolean open2 = false;

        System.out.println(open1);
        System.out.println(open2);

    }
}


