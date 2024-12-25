package Interface;


interface I1{
    void methodA();
}
interface I2{
    void methodB();

}

public class InterfaceTest implements I1,I2 {
        @Override
        public void methodA () {
            System.out.println("Bye");
        }

        @Override
        public void methodB () {
            System.out.println("Hello");
        }
    }
