package MID_Spring2022;

public class Override2 extends Base{
    Override2(int a,double b){
        super(a,b);
    }
    public Override2(Override2 obj2){
        super(obj2);
    }
    public void show(){
        super.show();
    }
}
