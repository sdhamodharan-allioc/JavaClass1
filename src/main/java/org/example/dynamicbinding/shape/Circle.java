package org.example.dynamicbinding.shape;

public class Circle extends Shape{
    private int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Draw a circle for a given radius of :"+radius);
    }
}
