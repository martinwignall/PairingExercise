package uk.co.transactis;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class TriangleTest {

    @Test
    public void shouldReturnAreaOfTriangleIfAsked() {
        Triangle triangle = new Triangle();
        assertThat(triangle.getArea(), equalTo(50d));
    }
}
