package lab6;

public class Line {
    private Point begin;
    private Point end;

    public Line(int x1, int y1, int x2, int y2) {
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEnd(int y) {
        end.setY(y);
    }

    public int[] getBeginXY() {
        return new int[]{begin.getX(), begin.getY()};
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public int[] getEndXY() {
        return new int[]{end.getX(), end.getY()};
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public double getLength() {
        int xDiff = begin.getX() - end.getX();
        int yDiff = begin.getY() - end.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = begin.getX() - end.getX();
        int yDiff = begin.getY() - end.getY();
        return Math.atan2(yDiff, xDiff);
    }

    @Override
    public String toString() {
        return "Line[begin = " + begin.toString() + ", end = " + end.toString() + "]";
    }

}
