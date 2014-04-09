package uk.co.transactis;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		App app = new App();
		
		float totalArea = app.getTotalArea(null);
		
		assertThat(totalArea, is(3435f));
		
	}

}
