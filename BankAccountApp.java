package backaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[]args){
        List<Account>accounts=new LinkedList<Account>();

        /*checking chkacc1= new checking("RAJ PATTANAIK","321456879",8000);
        savings savacc1=new savings("jack lee","456657897",7779);
     //   savacc1.compound();
savacc1.showInfo();
        System.out.println("***********************************8");
chkacc1.showInfo();
*/

        /*read a csv file then create new account based on that data*/

        String file="G:\\newbankaccount.csv";

        List<String[]> newAccountHolders = utilities.csv.read(file);
        for(String[] accountHolder : newAccountHolders) {
            System.out.println("NEW ACCOUNT:");
            String name=accountHolder[0];
            String sSN=accountHolder[1];
            String accountType=accountHolder[2];
            double initDeposit=Double.parseDouble(accountHolder[3]);

          if(accountType.equals("SAVING")){

              accounts.add(new savings(name,sSN,initDeposit));
          }

else if (accountType.equals("checking")){

                accounts.add(new checking(name,sSN,initDeposit));
            }
else {
              System.out.println("error reading account type");
          }
        }

              for (Account acc: accounts){
                  System.out.println("\n********************************8");
                  acc.showInfo();
              }

    }
}
