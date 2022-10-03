import java.util.ArrayList;
import java.util.List;


interface Figure {
    public double getPerimeter();
}

class Rectang implements Figure {
    double width;
    double height;

    public Rectang(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getPerimeter() {
        return this.height * 2 + this.width * 2;
    }
}

class Square implements Figure {
    double width;

    public Square(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return width * 4;
    }
}

 class MyUtils {
    public double sumPerimeter(List<Figure> firures) {
        double sum = 0;

        for (int i = 0; i < firures.size(); i++) {
            if (firures.get(i) != null) {
                sum += firures.get(i).getPerimeter();
            }
        }
        return sum;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
    }
}
