package uk.co.transactis;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class AppTest {

	@Test
	public void shouldCalculateAreaForReadMeFileProblem() {
		App app = new App();
		
		double totalArea = app.getTotalArea(null);
		
		assertThat(totalArea , is(1392.699089050293d));
		
	}

}
