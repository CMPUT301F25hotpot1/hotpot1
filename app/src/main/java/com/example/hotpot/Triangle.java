package com.example.hotpot;

/**
 * Demo: A simple Triangle model that extends Shape.
 * Fields: sides a, b, c (e.g., pixels or arbitrary units).
 * Anchor point is inherited from Shape: (x, y).
 */
public class Triangle extends Shape {
    // Demo: three side lengths for the triangle
    public int a;
    public int b;
    public int c;

    /**
     * Demo: constructor for a triangle placed at (x, y) with sides a, b, c.
     * Note: Shape currently has no constructor, and x/y are public,
     * so we assign them directly here.
     */
    public Triangle(int x, int y, int a, int b, int c) {
        this.x = x;  // from Shape
        this.y = y;  // from Shape
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /** Demo: simple helper to compute the perimeter. */
    public int perimeter() {
        return a + b + c;
    }

    /** Demo: quick text description for testing/logging. */
    public String describe() {
        return "Triangle @(" + x + "," + y + ") sides=" + a + "," + b + "," + c;
    }
}
