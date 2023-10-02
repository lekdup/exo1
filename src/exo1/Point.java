package exo1;

public class Point {
    //attibutes
    private double x, y;

    // constructor
    public Point(double a, double b) {
        this.x = a;
        this.y = b;
    }
    // constructor by default
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    //
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    //methods
    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void rMoveTo(double dx, double dy) {
        //to ways to do it
        this.x = this.x + dx;
        this.y += dy;
    }

    //public float distance(Point p2) {
        //double dx = this.x - p2.x;
        //double dy = this.y - p2.y;
        // float dist2 = this.x;
       // return Math.sqrt(dist2);
    //}

    public String toString() {
        return "(" + this.x + "," + this.y +")";
    }
}
