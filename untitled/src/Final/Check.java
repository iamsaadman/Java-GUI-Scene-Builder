package Final;

class Point{
    int x, y;
    final int f = 10;
     Point p = new Point(1, 2);
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Check{
    public static void main(String args[]){
        Point point = new Point(5, 5);
        point.x = 10;
        point.y = 5;
        point.x = 10;
        point.p = new Point(1, 5);
        System.out.println(point);
    }
}
