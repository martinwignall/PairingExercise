package uk.co.transactis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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

    public float calculateTotalArea(Map<ShapeType, Integer> shapeMap) {
    	float areaSum = 0;
    	
    	for (Map.Entry<ShapeType, Integer> entry :  shapeMap.entrySet()) {
    		areaSum += shapeFactory.makeShape(entry.getKey()).getArea() * entry.getValue();
		}
    	
    	
    	return areaSum;
    }
}
