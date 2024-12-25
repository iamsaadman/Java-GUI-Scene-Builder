
public class Main {

    void show()
    {
        System.out.println(this);
    }
    public static void main(String[] args) {
        Main r = new Main();
        System.out.println(r);
        r.show();
    }

}
