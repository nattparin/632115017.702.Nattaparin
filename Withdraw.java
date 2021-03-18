//Nattaparin Somnuek 632115017
public class Withdraw extends Transaction {
   public double amount;

	public void excute(BankAccount acc, Double amount) {
        System.out.println("Your current balance "+acc.getAmount());
        System.out.println("Withdraw money: "+amount*-1);
        acc.setAmount(900);
        if(acc.getAmount() >= amount){
            System.out.print("Your balance ");
            System.out.println(acc.getAmount()-amount); 
        }
        if(acc.getAmount() < amount){
            System.out.println("Sorry your balance is not enough");
            
        }
        else{}
    }
    

}
