package Final;

 class Final {
    void mNumber(){
        System.out.println("01915282586");
    }
   void atmPIN()
    {
        System.out.println("1234");
    }
}
class Thief extends Final{
    @Override
    void mNumber(){
        System.out.println("01915282586");
    }

    void atmPIN(){
        System.out.println("1234");
    }
}
public class Main{
    public static void main(String[] args) {
        Thief t = new Thief();
        t.mNumber();
        t.atmPIN();
    }
}
