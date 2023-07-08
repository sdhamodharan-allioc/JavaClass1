package org.example.dynamicbinding.shape;

public class TestShapes2 {
    public static void main(String[] args) {
        Shape redRing = new Circle("RedRing", 20);
        Shape chessSquareBlack = new Square("ChessSquare", 4, "Black");
        Shape chessSquareWhite = new Square("ChessSquare", 4, "White");
        Shape shapeArray[] = new Shape[3];
        shapeArray[0] = redRing;
        shapeArray[1] = chessSquareWhite;
        shapeArray[2] = chessSquareBlack;
        drawAllObjects(shapeArray);
    }

    private static void drawAllObjects(Shape[] shapeArray) {
        for(Shape eachShape: shapeArray){
            eachShape.draw();
        }
    }
}
