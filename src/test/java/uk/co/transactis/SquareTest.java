package uk.co.transactis;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: martin
 * Date: 05/04/14
 * Time: 13:58
 * To change this template use File | Settings | File Templates.
 */
public class SquareTest {

    @Test
    public void shouldReturnAreaOfSquareIfRequested() {
        Square square = new Square();
        assertThat(square.area(), equalTo(100f));
    }
}
