package backaccountapp;

public class checking extends Account{
    //List the properties to checking accounts
   private int debitCardNumber;
  private   int debitCardPIN;
    //Constructor to initialize chechking account properties
    public checking(String name,String sSN,double initDeposit){
        super(name,sSN,initDeposit);
        accountNumber="2"+accountNumber;
setDebitCard();

    }
    public void setRate(){
      rate=  getBaseRate() *.15;
    }
    private void setDebitCard(){
        debitCardNumber=(int) (Math.random()*Math.pow(10,12));
        debitCardPIN=(int) (Math.random()*Math.pow(10,4));
    }
    //List any methods specific to checking accounts
    public void showInfo()
    {
        super.showInfo();
        System.out.println("your checking account features"+
                "\n Debit card number :"+debitCardNumber +
                "\n Debit card pin "+debitCardPIN);
    }

}
