package Super;

class A{
    A() {
        System.out.println("Hello Viewer");
    }
}
class B extends A{

    B(){
        super();
        System.out.println("Hello Learner");

    }
}
public class Main {
    public static void main(String[] args) {
        B r = new B();

    }
}
