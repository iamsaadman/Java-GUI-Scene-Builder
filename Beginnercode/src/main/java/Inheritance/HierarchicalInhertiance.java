
class A
{
    void input()
    {
        System.out.println("Enter your name: ");
    }
}
class B extends A
{
    void Show()
    {
        System.out.println("My name is Saadman");
    }
}
class C extends A
{
    void Display()
    {
        System.out.println("My name is Sakib");
    }
}

public class HierarchicalInhertiance {
    
    public static void main(String[] args) {
        B r = new B();
        C r2 = new C();
        r.input();
        r.Show();
        r2.input();
        r2.Display();
    }
}
