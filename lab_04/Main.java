package dmitry;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {

            Point p1 = new Point(0, 0);
            Point p2 = new Point(1, 0);
            Point p3 = new Point(0, 1);
            Point p4 = new Point(1, 1);

            Triangle triangle = new Triangle(p1, p2, p3);
            System.out.println(triangle);
            System.out.println("Area: " + triangle.area());
            System.out.println("Centroid: " + triangle.centroid());

            Quadrilateral quadrilateral = new Quadrilateral(p1, p2, p3, p4);
            System.out.println(quadrilateral);
            System.out.println("Area: " + quadrilateral.area());
            System.out.println("Centroid: " + quadrilateral.centroid());

            Circle circle = new Circle(p1, 5.0);
            System.out.println(circle);
            System.out.println("Area: " + circle.area());
            System.out.println("Centroid: " + circle.centroid());

        }
    }
