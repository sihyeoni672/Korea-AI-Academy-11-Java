package com.korai.study.practice.ex;

public class Practice02 {
    public static void main(String[] args) {
        System.out.println(TempConverter.toFahrenheit(36.5));
        System.out.println(TempConverter.toCelsius(212));
    }
}

class TempConverter{
    public static double toFahrenheit(double celsius){
        double result=celsius*9/5+32;
        return result;
    }
    public static double toCelsius(double fahrenheit){
        double result=(fahrenheit-32)*5/9;
        return result;
    }

}


