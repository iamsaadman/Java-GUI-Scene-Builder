package Thread;

class Mythread extends Thread{

    @Override
    public void run(){
        int i =0;
        while (i<4){
            System.out.println("My Cooking thread is Running");
            System.out.println("I am happy");
            i++;

        }
    }
}
class Mythread2 extends Thread{

    @Override
    public void run(){
        int i = 0;
        while (i<4){
            System.out.println("Thread 2 for Chatting with her");
            System.out.println("I am sad!");
            i++;
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
        t1.start();
        t2.start();
    }
}