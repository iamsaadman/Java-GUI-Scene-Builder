package Thread;


class MyThreadRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
        System.out.println("I am a thread not a threat");
    }
}

class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
        System.out.println("I am a thread 2 not a threat 2");
    }
}


public class Main2 {
    public static void main(String[] args) {
        MyThreadRunnable bullet1 = new MyThreadRunnable();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
