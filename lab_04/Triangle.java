package dmitry;

public class Triangle extends Figure {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        if (a.distanceTo(b) + b.distanceTo(c) <= c.distanceTo(a))
            throw new IllegalArgumentException("Degenerate triangle!");
        this.a = a;
        this.b = b;
        this.c = c;
    }

@Override
public double area() {
    return Math.abs(a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2.0;
}

@Override
public Point centroid() {
    return new Point((a.x + b.x + c.x) / 3, (a.y + b.y + c.y) / 3);
}

@Override
public String toString() {
    return String.format("Triangle[%s %s %s]", a, b, c);
}
}