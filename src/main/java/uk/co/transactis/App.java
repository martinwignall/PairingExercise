package uk.co.transactis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan
public class App
{
    //input args - no of squares, no of triangles
    public static void main( String[] args ) {
        App app = new App();

        List<Integer> squareAndTriangleQuantities=new ArrayList<Integer>();
        squareAndTriangleQuantities.add(3);
        squareAndTriangleQuantities.add(2);

        System.out.println("TOTAL AREA=" + app.getTotalArea(squareAndTriangleQuantities));
    }

    private float getTotalArea(List<Integer> squareAndTriangleQuantities) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        AreaCalculatorService areaCalculatorService = context.getBean(AreaCalculatorService.class);

        return areaCalculatorService.calculateTotalArea(squareAndTriangleQuantities);
    }

    @Bean
    ShapeFactory shapeFactory() {
        return new ShapeFactory();
    }

}
