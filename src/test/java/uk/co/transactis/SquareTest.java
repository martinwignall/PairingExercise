package uk.co.transactis;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class SquareTest {

    @Test
    public void shouldReturnAreaOfSquareIfRequested() {
        Square square = new Square();
        assertThat(square.getArea(), equalTo(100d));
    }
}
