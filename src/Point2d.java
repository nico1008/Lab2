public class Point2d {
    private double xCoord;
    private double yCoord;

    public Point2d ( double x, double y) {
        xCoord = x;
        yCoord = y;
    }

    public Point2d () {
        this(0, 0);
    }

    public double getX () {
        return xCoord;
    }

    public double getY () {
        return yCoord;
    }

    public void setX ( double val) {
        xCoord = val;
    }

    public void setY ( double val) {
        yCoord = val;
    }
    public boolean ravno (Point2d g){    // сравневание координат точек
        return  this.getX()==g.getX()&&this.getY()==g.getY();
    }
}
