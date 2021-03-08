package com.anpks.code.dsalgo.recursion;

public class Fibonacci {
    public static void main(String[] args) {

        int fibonacci = getFibonacci(10);
    }

    private static int getFibonacci(int num) {
        if(num < 1){
            System.out.println("Error..");
        }
        if(num == 1 || num == 2){
            return num-1;
        }

        return getFibonacci(num-1) + getFibonacci(num-2);
    }
}
