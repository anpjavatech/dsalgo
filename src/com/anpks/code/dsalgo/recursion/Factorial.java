package com.anpks.code.dsalgo.recursion;

public class Factorial {
    public static void main(String[] args) {
        int factorial = getFactorial(5);
        System.out.println(factorial);
    }

    private static int getFactorial(int num) {
        //base case
        if(num == 1){
            return 1;
        }
        //recursion step
        return num * getFactorial(num-1);
    }
}
