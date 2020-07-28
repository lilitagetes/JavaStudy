package Lab3;

public class Main {
    public static void main(String[] args) {
        MyPoint start = new MyPoint(10,10);
        MyPoint end = new MyPoint(20, 30);
        MyPoint stray;
        stray = end;

        System.out.println("Classloader of Account class:"
                + MyPoint.class.getClassLoader());

        //System.out.println(MyPoint.toString());
        System.out.println("Start point is: " + start);
        System.out.println("End point is: " + end);
        System.out.println("Stray: " + stray);
    }
}
