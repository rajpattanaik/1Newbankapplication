package backaccountapp;

public abstract class Account implements  Ibaserate {
    //List common properties for saving and checking account
   private String name;
    private String sSN;
    private double balance;
   private static int index=10000;

   protected String  accountNumber;
    protected double rate;
    //constructor to set base properties and initialize the account
    public Account(String name,String sSN,double initDeposit){
this.name=name;
this.sSN=sSN;
balance=initDeposit ;

        //set account number
        index++;
        this.accountNumber=setAccountNumber();
        setRate();


    }
    public abstract void setRate();
private String setAccountNumber(){
        String lastTwoofSSN=sSN.substring(sSN.length()-2,sSN.length());
        int uniqueID=index;
        int randomNumber=(int)(Math.random() * Math.pow(10, 3));
        return lastTwoofSSN + uniqueID+ randomNumber;
}
public void compound(){
    double accruedInterest =balance * (rate/100);
    balance=balance+accruedInterest;
    System.out.println("ACCRUED INTEREST : $"+accruedInterest);
    printBalance();
}

public void deposit(double amount){
    balance=balance+amount;
    System.out.println("Depositing $" +amount);
    printBalance();
}
public void withdraw(double amount){
    balance=balance-amount;
    System.out.println("withdrawing $"+ amount);
    printBalance();
}
public void transfer(String towhere,double amount){
    balance=balance-amount;
    System.out.println("transfering $" + amount +" to " + towhere);
    printBalance();
}
public void printBalance(){
    System.out.println("your balance is now : $"+balance);
}
    //List the common methods
    public void showInfo(){
        System.out.println("NAME: "+name +"\nACCOUNT NUMBER: " + accountNumber +"\nBALANCE:" + balance
        + "\nRATE:"+ rate +"%");
    }

}
