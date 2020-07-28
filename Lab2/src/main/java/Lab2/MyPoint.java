package Lab2;

public class MyPoint {
    private int iX;
    private int iY;

    public MyPoint(int x, int y)  {
        iX = x;
        iY = y;
    }

    public String toString() {
        return String.format ("x = " + iX + ", y = " + iY);
    }
}
