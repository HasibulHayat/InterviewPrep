package example1.bettercode;

public class FixedDepositAccount implements  BankAccount {
    @Override
    public void details() {
        System.out.println("FixedDeposit Account");
    }
}
