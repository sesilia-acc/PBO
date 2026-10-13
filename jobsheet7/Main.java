package jobsheet7;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Nino", "0812-0000-0002");
        BusinessAccount acc = new BusinessAccount("A002", customer, 2000000, 150000);

        boolean result = acc.withdraw(1500000);
        System.out.println("Withdraw 1500000 allowed? " + result);
        acc.printInfo();
    }
}
