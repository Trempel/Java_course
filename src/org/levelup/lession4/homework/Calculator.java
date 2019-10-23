package org.levelup.lession4.homework;

public class Calculator {

    int sum(int a, int b){
        return a+b;
    }
    long sum(long a, long b){
        return a+b;
    }
    double sum(double a, double b){
        return a+b;
    }
    int div(int a, int b){
        if (b==0){
            //TODO
            return Integer.parseInt(null);
        }
        return a/b;
    }
    long div(long a, long b){
        if (b==0){
            //TODO
            return Long.parseLong(null);
        }
        return a/b;
    }
    double div(double a, double b){
        if (b==0){
            //TODO
            return Double.parseDouble(null);
        }
        return a/b;
    }
    int min(int a, int b){
        return a-b;
    }
    long min(long a, long b){
        return a-b;
    }
    double min(double a, double b){
        return a-b;
    }
    int mult(int a, int b){
        return a*b;
    }
    long mult(long a, long b){
        return a*b;
    }
    double mult(double a, double b){
        return a*b;
    }
}
