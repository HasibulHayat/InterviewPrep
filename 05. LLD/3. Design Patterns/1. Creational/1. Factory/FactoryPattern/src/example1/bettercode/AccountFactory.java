package example1.bettercode;

public class AccountFactory {
    public BankAccount createAccount(String type) {
        if (type.equals("fixedDeposit")) {
            return new FixedDepositAccount();
        }
        else if (type.equals("current")) {
            return new CurrentAccount();
        }
        else if (type.equals("savings")) {
            return new SavingsAccount();
        }
        else {
            throw new IllegalArgumentException("Unknown account type");
        }
    }
}
