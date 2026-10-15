package com.korai.study.practice.ex;

public class Practice01 {
    public static void main(String[] args) {
        System.out.println(MathUtil.max(10,9,5));

    }
}
 class MathUtil{
    // static 객체를 생성하지 않고 불러 올 수 있음 int
    public static int max(int a,int b,int c){
        int result=a;

        if(b>result){
            result=b;
        }
        if(c>result){
            result=c;
        }
        return result;
    }
}
