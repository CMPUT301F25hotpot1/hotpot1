package com.example.hotpot;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;       // 修正这里
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
