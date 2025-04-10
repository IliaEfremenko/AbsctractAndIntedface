public class CreditAccount extends Account {
    protected long creditLimit;

    public CreditAccount(long creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean add(long amount) {
        if (getBalance() + amount <= 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean pay(long amount) {
        if (getBalance() - amount > creditLimit) {
            balance -= amount;
            return true;
        }
        return false;
    }
}