package com.example.hotpot;

public class Circle extends Shape {
    private double radius;

    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double area() { return Math.PI * radius * radius; }
    public double perimeter() { return 2 * Math.PI * radius; }
    public double getArea() { return area(); }
    public double getPerimeter() { return perimeter(); }
    
    @Override
    public String toString() {
        return "Circle{x=" + x + ", y=" + y + ", radius=" + radius + "}";
    }
}
