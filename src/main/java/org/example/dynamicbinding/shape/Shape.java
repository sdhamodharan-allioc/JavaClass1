package org.example.dynamicbinding.shape;

public abstract class Shape {
    private String name;
    public Shape(String name){
        this.name = name;
    }
    public void draw() {
        System.out.println("Draw the border");
    }
}
