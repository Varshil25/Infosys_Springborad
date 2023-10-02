package v3_OOP_Concept;

public class BankAccount_main {
    public static void main(String[] args) {
        Bank_Account b1 = new Bank_Account(123456, "Bank of Baroda", 10000);
        b1.DisplayCurrentBalance();
        b1.withdraw(5000);
        b1.DisplayCurrentBalance();
        b1.deposit(7000);
        b1.DisplayCurrentBalance();
        b1.withdraw(0);
        b1.deposit(-1221);
    }
}
