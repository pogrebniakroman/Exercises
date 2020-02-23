
public class Circle33 {

    public double x;
    public double y;
    public double radius;

    public Circle33(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;

    }

    public Circle33(double x, double y) {
        this(x,y,10);

    }

    public Circle33() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Circle33 circle = new Circle33();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle33 anotherCircle = new Circle33(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}