package lab6;

public class LineSub extends Point {
    Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line[begin = " + getBegin() + ", end = " + end + "]";
    }

    public Point getBegin() {
        return new Point(getX(), getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        setXY(begin.getX(), begin.getY());
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return getX();
    }

    public void setBeginX(int x) {
        setX(x);
    }

    public int getBeginY() {
        return getY();
    }

    public void setBeginY(int y) {
        setY(y);
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

    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getBeginXY() {
        return new int[]{getBeginX(), getBeginY()};
    }

    public void setBeginXY(int x, int y) {
        setXY(x, y);
    }

    public int[] getEndXY() {
        return new int[]{end.getX(), end.getY()};
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public double getLength() {
        int xDiff = getBeginX() - end.getX();
        int yDiff = getBeginY() - end.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = getBeginX() - end.getX();
        int yDiff = getBeginY() - end.getY();
        return Math.atan2(yDiff, xDiff);
    }
}
