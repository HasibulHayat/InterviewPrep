package example1.bettercode;

public class CurrentAccount implements BankAccount {
    @Override
    public void details() {
        System.out.println("Current Account");
    }
}
