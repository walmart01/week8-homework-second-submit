package cylinder_19;

public class Main {

    public static void main(String[] args) {

        Cylinder cylinder=new Cylinder(5.55,7.25);
        System.out.println("cylinder.redius="+cylinder.getRadius());
        Circle circle=new Circle(3.75);
        System.out.println("circle.radius="+circle.getRadius());
        System.out.println("circle area="+circle.getArea());
        System.out.println("cylinder.height="+cylinder.getHeight());
        System.out.println("cylinder.area="+cylinder.getArea());
        System.out.println("cylinder. volume="+cylinder.getVolume());
    }
}
