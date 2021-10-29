package cylinder_19;

public class Circle {
    double radius;

    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0.0;

        } else {

            this.radius = radius;
        }
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        double area;
        area = this.radius * this.radius * Math.PI;
        return area;
    }
}