package example1.bettercode;

public class SavingsAccount implements BankAccount {
    @Override
    public void details() {
        System.out.println("Savings Account");
    }
}
