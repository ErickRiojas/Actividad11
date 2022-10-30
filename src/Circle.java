class Circle extends Shape {

    public static final double PI = 3.141592;

    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getDiameter() {
        return radius * 2;
    }


    public double area() {
        return PI * radius * radius;
    }

    public double perimeter() {
        return PI * getDiameter();
    }

}