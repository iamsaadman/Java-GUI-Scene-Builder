import Vector.Vector;

public class Main{
    public static void main(String[] args) {
        Vector u,v,s;
        u=new Vector(2,1,-4,5);
        v=new Vector(0,1,-3,2);
        s=u.addVector(v);
        System.out.println("s = "+s.getW()+","+s.getX()+","+s.getY()+","+s.getZ());
        s= u;
        System.out.println("s1 = "+s.getW()+","+s.getX()+","+s.getY()+","+s.getZ());
    }
}