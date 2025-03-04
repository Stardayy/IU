import static java.lang.Math.sqrt;

public class Point {
    private double pointX, pointY;
    public Point(double pointX, double pointY){
        setPointX(pointX);
        setPointY(pointY);
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double distance(Point target){
        return sqrt((this.pointX - target.pointX));
    }
}
