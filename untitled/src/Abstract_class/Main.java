package Abstract_class;

public class Main {
    public static void main(String[] args) {
        MobileUser mu;// referance variable

        mu = new Rahim();
        mu.sendMessage();
        mu = new Karim();
        mu.sendMessage();

    }

}
