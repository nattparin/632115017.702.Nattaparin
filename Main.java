
public class Main {
    public static void main(String args[]) {
        BankAccount myAccount = new BankAccount(1000.00);

		Transaction viewBalance = new ViewBalance(); 
        
        System.out.println("------Check balance-------");
		viewBalance.excute(myAccount,0.00);
		Transaction withdraw = new Withdraw();
		Transaction deposit = new Deposit();
		
        System.out.println("-------Withdraw------------");
        withdraw.excute(myAccount, 100.00);
		
        System.out.println("------Check balance-------");
        viewBalance.excute(myAccount,0.00);		
		
        System.out.println("++++++++Deposit+++++++++");
        deposit.excute(myAccount, 500.00);
		
        System.out.println("------Check balance--------");
        viewBalance.excute(myAccount,0.00);

        System.out.println("-------Withdraw------------");
        withdraw.excute(myAccount, 2000.00);
        System.out.println("--------End of ATM-----------");
    }

}
