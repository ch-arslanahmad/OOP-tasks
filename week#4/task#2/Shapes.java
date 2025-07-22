public class Shapes {


    public static void main(String[] args) {
        Circle shape1 = new Circle(10f);
        System.out.println("Area of Area is " + shape1.findArea());
        Rectangle shape2 = new Rectangle(10f, 10f);
        System.out.println("Area of Rectangle is " + shape2.findArea());
    }

}

class Circle extends Shapes{
    float radius;
    static float PI = 3.14f;

    Circle(float radius) {
        this.radius = radius;
    }

    float findArea() {
        float area = (radius * radius) * PI;
        return area;
    }
    
}


class Rectangle extends Shapes{
    float height;
    float width;

    Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    float findArea() {
        float area = height * width;
        return area;
    }

}