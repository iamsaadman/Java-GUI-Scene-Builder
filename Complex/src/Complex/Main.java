package Complex;

public class Main {
    public static void main(String[] args) {
        ComplexNum z1, z2, c1, c2, c3, c4;
        z1 = new ComplexNum(5, 10);
        z2 = new ComplexNum(-3, 5);
        c1 = z1.add(z2);
        System.out.println("c1 = " + c1.getX() + "+i" + c1.getY());

        c2 = z1.sub(z2);
        System.out.println("c2 = " + c2.getX() + "+i" + c2.getY());

        c3 = z1.mul(z2);
        System.out.println("c3 = " + c3.getX() + "+i" + c3.getY());

        c4 = z1.div(z2);
        System.out.println("c4 = " + c4.getX() + "+i" + c4.getY());

        double p = z1.abs();
        System.out.println(p);
    }
}
