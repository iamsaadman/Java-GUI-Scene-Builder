package MID_Spring2022;

public class Base {
    public int a;
    private double b;
    Base(int a,double b){
        this.a=a;
        this.b=b;
    }
    public double getB(){
        return this.b=b;
    }
    Base(Base ob){
        a=ob.a;
        b=ob.b;
    }
    void show(){
        System.out.println("Sum of variables"+"In the Base class "+ a+b);
    }
    Base(){
        super();
    }
}
