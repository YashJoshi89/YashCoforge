abstract class Shape {

    abstract void area();

    abstract void perimeter();
}

class Square extends Shape {

    private double side;

    // Non-Parameterized Constructor
    public Square() {
        this.side = 1;
    }

    // Parameterized Constructor
    public Square(double side) {
        this.side = side;
    }

    @Override
    void area() {
        System.out.println("Area of Square = " + (side * side));
    }

    @Override
    void perimeter() {
        System.out.println("Perimeter of Square = " + (4 * side));
    }
}

class Circle extends Shape {

    private double radius;

    // Non-Parameterized Constructor
    public Circle() {
        this.radius = 1;
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Area of Circle = " + (Math.PI * radius * radius));
    }

    @Override
    void perimeter() {
        System.out.println("Perimeter of Circle = " + (2 * Math.PI * radius));
    }
}

class Rectangle extends Shape {

    private double length;
    private double width;

    // Non-Parameterized Constructor
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    // Parameterized Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        System.out.println("Area of Rectangle = " + (length * width));
    }

    @Override
    void perimeter() {
        System.out.println("Perimeter of Rectangle = " + (2 * (length + width)));
    }
}

public class AbstractAssignment {

    public static void main(String[] args) {

        // Parameterized Constructors
        Shape sh1 = new Square(4);
        sh1.area();
        sh1.perimeter();

        System.out.println();

        Shape sh2 = new Circle(5);
        sh2.area();
        sh2.perimeter();

        System.out.println();

        Shape sh3 = new Rectangle(10, 5);
        sh3.area();
        sh3.perimeter();

        System.out.println();

        // Non-Parameterized Constructors
        Shape sh4 = new Square();
        sh4.area();
        sh4.perimeter();

        System.out.println();

        Shape sh5 = new Circle();
        sh5.area();
        sh5.perimeter();

        System.out.println();

        Shape sh6 = new Rectangle();
        sh6.area();
        sh6.perimeter();
    }
}