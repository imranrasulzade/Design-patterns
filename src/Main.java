import prototype.Application;
import prototype.Shape;
import singleton.Government;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Singleton
        Government.getInstance().getText();
        //*****end singleton

        //Prototype
        Application application = new Application();
        List<Shape> list = application.getShapes();
        for(Shape shape : list){
            System.out.println(shape);
        }
        //*****end prototype



    }
}