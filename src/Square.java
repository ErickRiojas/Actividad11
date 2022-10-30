class Square extends Shape {

    protected double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
    public double area() {
        return sideLength * sideLength;
    }


    public double perimeter() {
        return sideLength * 4;
    }
}