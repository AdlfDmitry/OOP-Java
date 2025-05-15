package dmitry;

public class Quadrilateral extends Figure {
    private Point a, b, c, d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        if (a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(d) <= d.distanceTo(a))
            throw new IllegalArgumentException("Degenerate quadrilateral!");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double area() {
        Triangle t1 = new Triangle(a, b, c);
        Triangle t2 = new Triangle(a, c, d);
        return t1.area() + t2.area();
    }

    @Override
    public Point centroid() {
        return new Point((a.x + b.x + c.x + d.x) / 4, (a.y + b.y + c.y + d.y) / 4);
    }

    @Override
    public String toString() {
        return String.format("Quadrilateral[%s %s %s %s]", a, b, c, d);
    }
}