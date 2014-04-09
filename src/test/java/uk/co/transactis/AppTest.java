package uk.co.transactis;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class AppTest {

	@Test
	public void shouldCalculateAreaForReadMeFileProblem() {
		App app = new App();
		
		Map<ShapeType, Integer> shapeMap = new HashMap<>();
        
        shapeMap.put(ShapeType.SQUARE, 8);
        shapeMap.put(ShapeType.TRIANGLE, 4);
        shapeMap.put(ShapeType.CIRCLE, 5);
		
		double totalArea = app.getTotalArea(shapeMap);
		
		assertThat(totalArea , is(1392.699089050293d));
		
	}

}