package uk.co.transactis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


@Component
public class AreaCalculatorService {

    @Autowired ShapeFactory shapeFactory;

    public float calculateTotalArea(Map<ShapeType, Integer> shapeMap) {
    	return -1;
    }
}
