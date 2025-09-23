package com.example.hotpot;

public class Triangle extends Shape {
    
    public int a;
    public int b;
    public int c;

    public Triangle(int x, int y, int a, int b, int c) {
        this.x = x;  
        this.y = y;  
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int perimeter() {
        return a + b + c;
    }

    public String describe() {
        return "Triangle @(" + x + "," + y + ") sides=" + a + "," + b + "," + c;
    }
}
