public class MyRectangle {
    private MyPoint v1;
    private MyPoint v2;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint v1, MyPoint v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public MyPoint getV1() {
        return v1;
    }

    public void setV1(MyPoint v1) {
        this.v1 = v1;
    }

    public MyPoint getV2() {
        return v2;
    }

    public void setV2(MyPoint v2) {
        this.v2 = v2;
    }

    @Override
    public String toString() {
        return "Rectangle[top-left corner = " + v1 + ", bottom-right corner = " + v2 + "]";
    }

}
