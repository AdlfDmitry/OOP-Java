package task1;

public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(1, 1);
        Line line2 = new Line(-1, 3);

        Point intersectionPoint = line1.intersection(line2);
        if(intersectionPoint != null) {
            System.out.println("Intersection point: " + intersectionPoint);
        }
        else{
            System.out.println("Lines are parallel or coincident.");
        }
    }
}