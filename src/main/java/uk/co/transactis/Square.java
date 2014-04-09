package uk.co.transactis;


public class Square implements Shape {

    private int SQUARE_WIDTH=10;
    private int SQUARE_HEIGHT=10;

    public Square() {
    }

    public double getArea() {
        return SQUARE_HEIGHT * SQUARE_WIDTH;
    }
}
