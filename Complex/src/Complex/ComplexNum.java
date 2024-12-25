package Complex;

public class ComplexNum {
    private double x;
    private double y;
    public ComplexNum(double a,double b){
        this.x=a;
        this.y=b;
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    ComplexNum add(ComplexNum z){
        ComplexNum z1= new ComplexNum(0,0);
        z1.x=this.x+z.x;
        z1.y=this.y+z.y;
        return z1;
    }
    ComplexNum sub(ComplexNum z){
        ComplexNum z1= new ComplexNum(0,0);
        z1.x=this.x-z.x;
        z1.y=this.y-z.y;
        return z1;
    }
    ComplexNum mul(ComplexNum z){
        ComplexNum z1= new ComplexNum(0,0);
        z1.x=this.x*z.x-this.y*z.y;
        z1.y=this.x*z.y+this.y*z.x;
        return z1;
    }
    ComplexNum div(ComplexNum z){
        ComplexNum z1= new ComplexNum(0,0);
        double p= z.x*z.x+z.y*z.y;
        z1.x=(this.x*z.x+this.y*z.y)/p;
        z1.y=(-this.x*z.y+this.y*z.x)/p;
        return z1;
    }
    double abs(){
        double p = Math.sqrt(x*x+y*y);
        return p;
    }
}
