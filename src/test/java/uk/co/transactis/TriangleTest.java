package uk.co.transactis;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: martin
 * Date: 05/04/14
 * Time: 13:59
 * To change this template use File | Settings | File Templates.
 */
public class TriangleTest {

    @Test
    public void shouldReturnAreaOfTriangleIfAsked() {
        Triangle triangle = new Triangle();
        assertThat(triangle.getArea(), equalTo(50f));
    }
}
