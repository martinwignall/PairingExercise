package uk.co.transactis;

/**
 * Created with IntelliJ IDEA.
 * User: martin
 * Date: 05/04/14
 * Time: 13:59
 * To change this template use File | Settings | File Templates.
 */
public class Triangle implements Shape {

    private float TRIANGLE_WIDTH=10f;
    private float TRIANGLE_HEIGHT=10f;

    public float getArea() {
        return 0.5f * TRIANGLE_HEIGHT * TRIANGLE_WIDTH;
    }
}
