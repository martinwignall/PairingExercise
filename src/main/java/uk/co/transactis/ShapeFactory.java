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
    
    public Shape makeShape(ShapeType shape) {
		return SHAPE_FACTORY_HELPER.from(shape).createNewShape();
    }
    
    private static enum SHAPE_FACTORY_HELPER {
    	TRIANGLE(ShapeType.TRIANGLE) {
		@Override
		Shape createNewShape() {
			return new Triangle();
		}
	},    
    	SQUARE(ShapeType.SQUARE) {
		@Override
		Shape createNewShape() {
			return new Square();
		}
	},
	CIRCLE(ShapeType.CIRCLE) 	{
		@Override
		Shape createNewShape() {
			return new Circle();
		}
	};
	
	private ShapeType shapeType;
	
	
	private SHAPE_FACTORY_HELPER(ShapeType shapeType) {
		this.shapeType = shapeType;
	}
	
	static SHAPE_FACTORY_HELPER from(ShapeType shapeType) {
		for (SHAPE_FACTORY_HELPER shape : values()) {
			if (shapeType == shape.shapeType) {
				return shape;
			}
		}
		
		return null;
	}



	abstract Shape createNewShape();
		
    }
}
