package spring21;

class MyException extends Exception{
    public MyException(String message){
        super(message);

    }

}
public class InsufficientBalance extends Account {
    double current_balance;
    double withdraw_amount;

    public InsufficientBalance(String name, double balance, double current_balance, double withdraw_amount) {
        super(name, balance);
        this.current_balance = super.balance;
        this.withdraw_amount = withdraw_amount;
    }

        public double withdraw(double amount){
            if(current_balance<withdraw_amount){
                try {
                    throw new MyException("Not possible. Insufficient balance");
                }
                catch (MyException e){
                    System.out.println(e.getMessage());
                }
            }
            return current_balance-=withdraw_amount;
    }


}

