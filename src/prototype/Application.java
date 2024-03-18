package prototype;

import java.util.ArrayList;
import java.util.List;

public class Application {

    List<Shape> shapeList = new ArrayList<>();

    public Application(){
        Circle circle = new Circle();
        circle.x = 3;
        circle.y = 4;
        circle.radius = 5;
        shapeList.add(circle);

        Circle anotherCircle = circle.clone();
        shapeList.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 15;
        shapeList.add(rectangle);
    }

    public List<Shape> getShapes(){
        List<Shape> shapes = new ArrayList<>();

        for(Shape shape : shapeList){
            shapes.add(shape.clone());
        }

        return shapes;
    }

}
