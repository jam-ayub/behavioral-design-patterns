package general;

public class Account {
    private float balance;

    public void setBalanace(float balance) {
        if (balance > 0)
            this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void deposit(float amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(float amount) {
        if (amount <= balance)
            balance -= amount;
    }
}
