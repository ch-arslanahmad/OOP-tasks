// main parent class
public class Shapes {
    // variables 
    static float PI = 3.14f;
    float radius;
    float height;
    float width;

    // main method
    public static void main(String[] args) {
    // creating an object of circle
        Circle shape1 = new Circle(10f);
    // calling shape1(circle) method
        System.out.println("Area of Circle is " + shape1.findArea());
    // creating an object of Rectangle
        Rectangle shape2 = new Rectangle(10f, 10f);
    // calling shape2(circle) method
        System.out.println("Area of Rectangle is " + shape2.findArea());
    }

}

// class method
class Circle extends Shapes{

    // constructor

    Circle(float radius) {
        this.radius = radius;
    }

    // method
    float findArea() {
        float area = (radius * radius) * PI;
        return area;
    }
    
}


class Rectangle extends Shapes{

    // constructor
    Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    // method
    float findArea() {
        float area = height * width;
        return area;
    }
}