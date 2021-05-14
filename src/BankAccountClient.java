public class BankAccountClient {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Poor College Student");
        bankAccount1.setInterestRate(0.01);
        BankAccount bankAccount2 = new BankAccount("Scrooge McDuck", 50000,false, 0.85);
        bankAccount1.deposit(600);
        bankAccount2.withdraw(22500);
        bankAccount1.setInterestRate(bankAccount1.getInterestRate()+0.5);
        bankAccount2.setInterestRate(bankAccount2.getInterestRate()+0.5);
        bankAccount1.payInterest();
        bankAccount2.payInterest();
    }
}
