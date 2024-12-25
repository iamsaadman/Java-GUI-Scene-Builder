package spring21;

public class Account {
    String name;
    double balance;
    Account(String name , double balance){
        this.name = name;
        this.balance = balance;
    }
    double withdraw(double amount)throws MyException{
        return 0;
    }

}
