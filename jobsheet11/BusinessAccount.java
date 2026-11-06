package jobsheet11;

public class BusinessAccount extends Account {
    private double MINIMUM_BALANCE;

    public BusinessAccount(String accountNumber, Customer owner, double balance) {
        super(accountNumber, owner, balance);
    }

    @Override
    protected boolean canWithdraw(double amount) {
        return amount > 0 && (getBalance() - amount) >= MINIMUM_BALANCE;
    }

    @Override 
    public double monthlyFee() {
        return 0;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Account Type: Business");
    }
}
