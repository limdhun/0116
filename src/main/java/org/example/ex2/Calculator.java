package org.example.ex2;

public interface Calculator {
    public int key = 10;
    int add(int num1, int num2);
    default int sub(int num1, int num2){
        return num1 - num2;
    }




}
