import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public double getArea();
}

class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.141592654 * this.radius * this.radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle(String name, double width, double height) {
        super(name);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }
}

class MyUtils {
    public List<Shape> maxAreas(List<Shape> shapes) {
        List<Shape> resList = new ArrayList<Shape>();
        Shape max = shapes.get(0);

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).getArea() > max.getArea()) {
                max = shapes.get(i);
            }
        }
        resList.add(max);
        return resList;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        MyUtils mu = new MyUtils();

        Circle circle1 = new Circle("circle1", 2);
        Circle circle2 = new Circle("circle2", 0.50);
        Circle circle3 = new Circle("circle3", 1.00);
        Rectangle rectangle1 = new Rectangle("rec1", 2.00, 3.00);
        Rectangle rectangle2 = new Rectangle("rec2", 3.00, 2.00);
        Rectangle rectangle3 = new Rectangle("rec3", 1.00, 2.00);
        List<Shape> resList = new ArrayList<Shape>();
        resList.add(circle1);
        resList.add(circle2);
        resList.add(circle3);
        resList.add(rectangle1);
        resList.add(rectangle2);
        resList.add(rectangle3);

        System.out.println(mu.maxAreas(resList));
    }
}
