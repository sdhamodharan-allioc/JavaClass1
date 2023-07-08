package org.example.dynamicbinding.shape;

public class TestShapes {
    public static void main(String[] args) {
        Shape redRing = new Circle("RedRing", 20);
        drawPicture(redRing);
        Shape chessSquareBlack = new Square("ChessSquare", 4, "Black");
        drawPicture(chessSquareBlack);
        Shape chessSquareWhite = new Square("ChessSquare", 4, "White");
        drawPicture(chessSquareWhite);


    }

    /**
     * Implementation is common for any of the subclasses.
     * Dynamic binding calls the respective subclass implementation.
     * */
    private static void drawPicture(Shape anyShape) {
        anyShape.draw();
    }
}
