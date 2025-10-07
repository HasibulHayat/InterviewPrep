package example1;

import example1.bettercode.AccountFactory;
import example1.bettercode.BankAccount;

public class FirstMain {
    public static void main(String[] args) {
        System.out.println("This is the first example section ... ");

        String accountType = "savings";

//        BankAccount account;
//
//        if (accountType.equals("savings")) {
//            account = new SavingsAccount();
//            account.accountDetails();
//        }
//        else if (accountType.equals("fixedDeposit")) {
//            account = new FixedDepositAccount();
//            account.accountDetails();
//        }
//        else if (accountType.equals("current")) {
//            account = new CurrentAccount();
//            account.accountDetails();
//        }

        AccountFactory accountFactory = new AccountFactory();

        BankAccount account1 = accountFactory.createAccount(accountType);
        account1.details();
    }
}
