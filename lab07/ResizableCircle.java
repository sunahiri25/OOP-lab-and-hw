public class ResizableCircle extends Circle1 implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle[" + super.toString() + "]";
    }

    @Override
    public void resize(int percent) {
        radius *= percent / 100.0;
    }
}
