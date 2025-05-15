package task3;
import task1.Point;
public class Triangle {
    private Point vertex1;
    private Point vertex2;
    private Point vertex3;

    public Triangle(Point vertex1, Point vertex2, Point vertex3) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;

        if (!isValidTriangle()) {
            throw new IllegalArgumentException("Invalid triangle vertices.");
        }
    }

    public double area() {
        return Math.abs(0.5 * ((vertex1.getX() - vertex3.getX()) * (vertex2.getY() - vertex3.getY()) -
                (vertex2.getX() - vertex3.getX()) * (vertex1.getY() - vertex3.getY())));
    }

    private boolean isValidTriangle() {
        return area() != 0;
    }
    public Point centroid() {
        double centroidX = (vertex1.getX() + vertex2.getX() + vertex3.getX()) / 3;
        double centroidY = (vertex1.getY() + vertex2.getY() + vertex3.getY()) / 3;
        return new Point(centroidX, centroidY);
    }
}