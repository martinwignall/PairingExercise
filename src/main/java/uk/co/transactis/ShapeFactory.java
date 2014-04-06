package uk.co.transactis;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: martin
 * Date: 06/04/14
 * Time: 08:29
 * To change this template use File | Settings | File Templates.
 */
public class ShapeFactory {


    public List<? extends Shape> getShapes(List<Integer> squareAndTriangleQuantities) {

        List<Square> squareList = new ArrayList<Square>();
        Integer numberOfSquares = squareAndTriangleQuantities.get(0);
        for (int i = 0; i < numberOfSquares; i++) {
            squareList.add(new Square());
        }

        return squareList;
    }
}
