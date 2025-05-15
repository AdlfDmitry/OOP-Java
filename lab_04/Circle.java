package dmitry;

public class Circle extends Figure {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        if (radius <= 0)
            throw new IllegalArgumentException("Invalid radius!");
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public Point centroid() {
        return center;
    }

    @Override
    public String toString() {
        return String.format("Circle[%s Radius: %f]", center, radius);
    }
}