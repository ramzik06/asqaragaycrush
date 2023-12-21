public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point q){
        double a = q.x;
        double b = q.y;
        return Math.sqrt((x-a)*(x-a) + (y-b)*(y-b));

    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    // constructor having both parameters

    // distance(Point dest) - distance from current point to the dest point

    // toString
}