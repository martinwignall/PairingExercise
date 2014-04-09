package uk.co.transactis;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class App
{	
    //input args - no of squares, no of triangles
    public static void main( String[] args ) {
        App app = new App();

        Map<ShapeType, Integer> shapes = null;
        
        
        System.out.println("Total area = " + app.getTotalArea(shapes));
        
    }

    double getTotalArea(Map<ShapeType, Integer> shapeMap) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        AreaCalculatorService areaCalculatorService = context.getBean(AreaCalculatorService.class);
        
        
        return areaCalculatorService.calculateTotalArea(shapeMap);
    }

    @Bean
    ShapeFactory shapeFactory() {
        return new ShapeFactory();
    }
}
