package Vector;

public class Vector {
    private double w,x,y,z;
    public Vector(double a,double b, double c, double d){
        this.w=a;
        this.x=b;
        this.y=c;
        this.z=d;
    }

    public double getW() {
        return w;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
    public Vector addVector(Vector v){
        double w1=this.w+v.w;
        double x1=this.x+v.x;
        double y1=this.y+v.y;
        double z1=this.z+v.z;

        Vector s;
        s=new Vector(w1,x1,y1,z1);

        return s;
    }
    public double NormVector(int p){
        double u = Math.pow(Math.pow(Math.abs(w),p)+Math.pow(Math.abs(x),p)+Math.pow(Math.abs(y),p)+Math.pow(Math.abs(z),p),1.0/p);
        double Norm = Math.pow(u,1.0/p);
        return Norm;
    }
    public Vector mulVector(Vector v){
        double w1=this.w*v.w;
        double x1=this.x*v.x;
        double y1=this.y*v.y;
        double z1=this.z*v.z;


        Vector s;
        s=new Vector(w1,x1,y1,z1);


        return s;
    }

    public double ScalarVector(Vector v){
        double w1=this.w*v.w;
        double x1=this.x*v.x;
        double y1=this.y*v.y;
        double z1=this.z*v.z;


        Vector s;
        s=new Vector(w1,x1,y1,z1);

        double sum = w1+x1+y1+z1;

        return sum;

    }

    public Vector crossmulti(Vector v){
        double w1=  x*v.y-y*v.x;
        double x1= -(this.w-y*v.w);
        double y1= this.w*v.x-x*v.w;
        double z1=0;

        Vector s;
        s= new Vector(w1,x1,y1,z1);
        return s;
    }
    public double angle(Vector v){
        double ang=0;


        return ang=Math.toDegrees(Math.acos(ScalarVector(v)/(NormVector(2)*v.NormVector(2))));


    }

    public static void main(String[] args) {
        Vector u,v,s,s1,s2;
        double s3,s4;
        u = new Vector(2,1,-4,5);
        v= new Vector(0,1,-3,2);

        System.out.println("First Vector u: "+u.getW()+" , "+u.getX()+" , "+u.getY()+" , "+u.getZ());
        System.out.println("Second Vector v: "+v.getW()+" , "+v.getX()+" , "+v.getY()+" , "+v.getZ());
        s=u.addVector(v);
        s1=u.mulVector(v);
        s2=u.crossmulti(v);
        s3=u.ScalarVector(v);
        s4=u.angle(v);
        System.out.println("Add vector : "+s.getW()+" , "+s.getX()+" , "+s.getY()+" , "+s.getZ());
        System.out.println("Multiplication of Vector: "+s1.getW()+" , "+s1.getX()+" , "+s1.getY()+" , "+s1.getZ());
        System.out.println("Cross-Multiplication of Vector: "+s2.getW()+" , "+s2.getX()+" , "+s2.getY()+" , "+s2.getZ());
        System.out.println("Scalar of two Vectors value: "+s3);
        System.out.println("Angle Between two vectors: "+s4);


    }

}
