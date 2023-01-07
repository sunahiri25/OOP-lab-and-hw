package lab6;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub lineSub1 = new LineSub(1, 2, 3, 4);
        System.out.println(lineSub1);
        System.out.println(lineSub1.getBegin());
        System.out.println(lineSub1.getEnd());

        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        LineSub lineSub2 = new LineSub(point1, point2);
        System.out.println(lineSub2);
        System.out.println(lineSub2.getLength());

        lineSub2.setBegin(new Point(6, 8));
        System.out.println(lineSub2.getBegin());
        lineSub2.setEndY(1);
        System.out.println(lineSub2.getEnd());
    }

}
