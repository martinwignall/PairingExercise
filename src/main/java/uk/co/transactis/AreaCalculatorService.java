package uk.co.transactis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: martin
 * Date: 06/04/14
 * Time: 08:41
 * To change this template use File | Settings | File Templates.
 */

@Component
public class AreaCalculatorService {

    @Autowired ShapeFactory shapeFactory;

    public float calculateTotalArea(List<Integer> squareAndTriangleQuantities) {
        List<Shape> shapeList = (List<Shape>)shapeFactory.getShapes(squareAndTriangleQuantities);

        return 0;
    }
}
