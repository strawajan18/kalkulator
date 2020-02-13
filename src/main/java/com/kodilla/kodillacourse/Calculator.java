package com.kodilla.kodillacourse;

import java.util.*;
import java.lang.*;
import java.io.*;

class Calculator {
    int x;
    int y;

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY()  {
        return y;
    }

    public int addition() {
        return x + y;
    }

    public int substraction() {
        if (x>y) {
            return x-y;
        } else {
            return y-x;
        }
    }
}

class Run {

    public static void main (String[] args) {

        Calculator calculator = new Calculator(345, 567);
        int result = calculator.substraction();
        System.out.println(result);
    }
}
