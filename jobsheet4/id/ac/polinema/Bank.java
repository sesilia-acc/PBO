public class Bank {
    private Account[] accounts;
    private int count;

    public Bank(int capacity) {
        accounts = new Account[capacity];
        count = 0;
    }

    public boolean addAccount(Account account) {
        if (count >= accounts.length) {
            return false;
        }
        accounts[count] = account;
        count++;
        return true;
    }
    public Account findAccount (String accountNumber) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }

    public Account[] findAccountsByOwner(String ownerName) {
       int matchCount = 0;
       for (int i = 0; i < count; i++) {
           if (accounts[i].getOwner().getName().equals(ownerName)) {
               matchCount++;
           }
       }
       Account[] match = new Account[matchCount];
       int index = 0;
       for (int i = 0; i < count; i++) {
           if (accounts[i].getOwner().getName().equals(ownerName)) {
               match[index] = accounts[i];
               index++;
           }
       }
       return match;
    }

    public void printAllAccounts() {
        for (int i = 0; i < count; i++) {
            accounts[i].printInfo();
        }
    }
}
