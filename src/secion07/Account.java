package secion07;

public class Account {

    int balance;

    public void deposit(int amount) {
        if(amount < 0) return;

        this.balance += amount;
        System.out.println("Your balance is: " + this.balance);
    }

    public void withdraw(int amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Your balance is: " + this.balance);
        } else {
            System.out.println( "Insufficient Funds. Your balance is: " + this.balance);
        }
    }
}
