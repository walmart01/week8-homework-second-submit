package cylinder_19;

public class Cylinder extends Circle {
    double height;

    public Cylinder(double height, double radius) {
        super(5.5);

        if (height < 0) {
            this.height = 0.0;
        } else {
            this.height = height;
        }

    }

    public double getHeight() {
        return this.height;

    }

    public double getVolume() {
        double volume;
        volume = super.getArea() * this.height;
        return volume;
    }
}