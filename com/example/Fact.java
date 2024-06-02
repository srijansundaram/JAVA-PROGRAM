package com.example;

public class Fact {
    public int calculateFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * calculateFactorial(num - 1);
    }
}