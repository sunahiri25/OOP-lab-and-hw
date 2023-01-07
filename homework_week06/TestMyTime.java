public class TestMyTime {
    public static void main(String[] args) {
        // Test Constructors and toString()
        MyTime t1 = new MyTime(23, 59, 59);
        System.out.println(t1);
        MyTime t2 = new MyTime();
        System.out.println(t2);

        // Test Getters and Setter
        t2.setTime(14, 1, 2);
        System.out.println(t2.getHour());
        System.out.println(t2.getMinute());
        System.out.println(t2.getSecond());

        // Test other methods
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextMinute());
        System.out.println(t1.nextHour());
        System.out.println(t1.previousSecond());
        System.out.println(t1.previousMinute());
        System.out.println(t1.previousHour());
    }
}
