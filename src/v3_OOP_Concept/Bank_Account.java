package v3_OOP_Concept;

public class Bank_Account {
    private int Account_Number;
    private String Account_Name;
    private double Account_Balance;

    public void deposit(double amt){
        if (amt > 0){
            Account_Balance = Account_Balance + amt;
            System.out.println("Your Amount is successfully Deposit : $" + amt);
        }
        else {
            System.out.println("Amount does not deposit..");
        }
    }

    public void withdraw(double amt){
        if (amt > 0){
            Account_Balance = Account_Balance - amt;
            System.out.println("Your Amount is successfully Withdraw : $" + amt);
        }
        else {
            System.out.println("Amount does not Withdraw..");
        }
    }

    public void DisplayCurrentBalance(){
        System.out.println("Your Current Balance is : $ " + Account_Balance);
    }

    public Bank_Account(int Account_Number , String Account_Name , double Account_Balance){
        this.Account_Number = Account_Number;
        this.Account_Name = Account_Name;
        this.Account_Balance = Account_Balance;
    }
}
