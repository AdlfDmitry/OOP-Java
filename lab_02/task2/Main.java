package task2;
import task1.Point;
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(4,6);
        Point p2 = new Point(3,4);

        System.out.println("Point 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Point 2: (" + p2.getX() + ", " + p2.getY() + ")");

        Segment segment1 = new Segment(p1, p2);
        System.out.println("Length of Segment 1: " + segment1.length());
        System.out.println("Middle point of Segment 1: (" + segment1.middle().getX() + ", " + segment1.middle().getY() + ")");

        Point p3 = new Point(3, 4);
        Point p4 = new Point(8, 7);
        Segment segment2 = new Segment(p3, p4);

        Point intersection = segment1.intersection(segment2);
        if (intersection != null) {
            System.out.println("Intersection point: (" + intersection.getX() + ", " + intersection.getY() + ")");
        } else {
            System.out.println("Segments do not intersect.");
        }



    }

}
