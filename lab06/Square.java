package lab6;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSize() {
        return getWidth();
    }

    public void setSize(double size) {
        super.setWidth(size);
        super.setLength(size);
    }

    @Override
    public void setWidth(double size) {
        setSize(size);
    }

    @Override
    public void setLength(double size) {
        setSize(size);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
