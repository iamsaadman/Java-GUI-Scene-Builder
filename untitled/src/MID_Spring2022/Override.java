package MID_Spring2022;

public class Override extends Base{
    int c;
    double b=getB();
    Override(int a,double b,int c){
        super(a,b);
        this.c=c;
    }
    double sum=0.0;
    public void show(){
        sum+=a+b+c;
        System.out.println("Sum of three variables: "+sum);
    }

}
