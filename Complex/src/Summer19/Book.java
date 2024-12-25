package Summer19;

public class Book{
    static class Cover{
        public void foo(){
            System.out.println("Inside foo");
        }
    }
    void bar(){
        System.out.println("Inside bar");
    }
    public static void main(String args[]){
        Cover a= new Cover();
        a.foo();
        Book b = new Book();
        b.bar();
    }
}