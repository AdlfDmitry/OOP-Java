package task3;
import task1.Point;
public class Main {
    public static void main(String[] args) {
        Point vertex1 = new Point(2, 4);
        Point vertex2 = new Point(7, 2);
        Point vertex3 = new Point(8, 3);

        try {
            Triangle triangle = new Triangle(vertex1, vertex2, vertex3);
            System.out.println("Area of the triangle: " + triangle.area());
            Point centroid = triangle.centroid();
            System.out.println("Centroid of the triangle: (" + centroid.getX() + ", " + centroid.getY() + ")");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}