import java.lang.Math;

class EquilateralTriangle {

    private double sideLength;   // cm
    private double heightLength; // cm

    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
        this.heightLength = calculateHeightLength();
    }


    private double calculateHeightLength() {
        return (Math.sqrt(3) * this.sideLength) / 2.0;
    }


    public double area() {
        return calculateHeightLength();
    }


    public double perimeter() {
        return sideLength * 3;
    }
}
