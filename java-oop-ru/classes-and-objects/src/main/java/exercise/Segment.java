package exercise;

// BEGIN
public class Segment {
    private Point beginPoint;
    private Point endPoint;
    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }
    public Segment() {
    }
        public Point getBeginPoint() {
            return beginPoint;
        }

        public Point getEndPoint() {
            return endPoint;
        }
    public Point getMidPoint() {
        Point i = new Point();
        i.setX((endPoint.getX() + beginPoint.getX()) / 2);
        i.setY((endPoint.getY() + beginPoint.getY()) / 2);
        return i;
    }


}
// END
