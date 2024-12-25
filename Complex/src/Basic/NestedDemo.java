package Basic;

class Outer1 {
     static class Inner1{
        void show(){
            System.out.println("I am showing");
        }

    }
}
class Outer2{
     static class Inner2{
        void show(){
            System.out.println("I am showing 2");
        }

    }
}
public class NestedDemo  {
    public static void main(String[] args) {

        Outer1.Inner1 a = new Outer1.Inner1();
        a.show();

        Outer2.Inner2 b = new Outer2.Inner2();
        b.show();
    }
}
