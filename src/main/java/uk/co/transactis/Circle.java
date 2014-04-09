package uk.co.transactis;

public class Circle implements Shape {

    private int RADIUS=5;

    public double getArea() {
    	return (float)Math.PI * RADIUS * RADIUS;
    }
}
