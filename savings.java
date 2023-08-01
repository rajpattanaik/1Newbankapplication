package backaccountapp;

public class savings extends Account{
    //List the properties specific to the saving account
   private int safetyDepositBoxID;
   private int safetyDepositBoxKey;
    //Constructor to initialize setting for the saving properties
public savings(String name, String sSN, double initDeposit) {
    super(name, sSN, initDeposit);
    accountNumber = "1" + accountNumber;
    setSafetyDepositBox();
}
    public void setRate(){
      rate = getBaseRate()-.25;

    }

private void setSafetyDepositBox() {
    safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
    safetyDepositBoxKey=(int) (Math.random() * Math.pow(10, 4));
}
    public void showInfo(){
        System.out.println("ACCOUNT TYPE: savings");
    super.showInfo();
        System.out.println(
                "YOUR SAVINGS ACCOUNT FEATURES" +"\n safety deposit box id:" +safetyDepositBoxID
                + "\n safety deposit box key: "+safetyDepositBoxKey
        );



}

    //List any methods specific to aving account
}
