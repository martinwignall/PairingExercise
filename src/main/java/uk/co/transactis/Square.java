package uk.co.transactis;

/**
 * Created with IntelliJ IDEA.
 * User: martin
 * Date: 05/04/14
 * Time: 13:58
 * To change this template use File | Settings | File Templates.
 */
public class Square implements Shape {

    private int SQUARE_WIDTH=10;
    private int SQUARE_HEIGHT=10;

    public Square() {
    }

    public float getArea() {
        return SQUARE_HEIGHT * SQUARE_WIDTH;
    }
}
