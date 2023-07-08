package org.example.dynamicbinding.shape;

public class Square extends Shape{
    private int side;
    private String color;

    public Square(String name, int side, String color) {
        super(name);
        this.side = side;
        this.color = color;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Draw a square of side : "+side +" of color :"+color);
    }
}
