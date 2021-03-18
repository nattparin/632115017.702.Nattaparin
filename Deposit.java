//Nattaparin Somnuek 632115017
public class Deposit extends Transaction {
  

	public void excute (BankAccount acc, Double amount) {
        System.out.println("Your current balance "+acc.getAmount());
        System.out.println("Withdraw money:"+"+"+amount);
        System.out.print("Your balance");
        System.out.println(acc.getAmount()+amount);
        acc.setAmount(1400);
        
    }
}
