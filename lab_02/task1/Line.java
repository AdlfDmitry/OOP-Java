package task1;

public class Line {
  final private double k;
  final private double b;

    public Line (double k, double b){
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other){
        if (this.k == other.k ) {
            if (this.b == other.b) {
                return null;
            } else {
                return null;
            }
        } else {
            double x = (other.b - this.b) / (this.k - other.k);
            double y = this.k * x + this.b;
            return new Point(x, y);
        }
    }
}