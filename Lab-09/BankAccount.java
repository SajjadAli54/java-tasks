class BankAccount implements Runnable{
   double balance = 0;
   Thread[] threads = new Thread[5000];

    public void run(){
	for(int i=0;i<threads.length;i++){
		try{
		    Thread.sleep(200);
		}catch(Exception e){}
		if(i%2 == 0){
			deposit(1);
			System.out.println("Deposit 1");
		}
		else{
			double bal = withdraw(1);
			System.out.println("Withdraw 1");
			if(bal == 0) System.out.println("Zero balance at  "+i); 
		}
	}

   }

   public double retrieve(){
	return balance;
   }

   public synchronized double withdraw(double amount){
	if(amount <= balance){
	     balance -= amount;
	     return amount;
	}
	else{
	    System.out.println("Your balance is "+balance);
	    return -1;
	}
   }

   public synchronized void deposit(double amount){
	balance += amount;
   }


    public static void main(String args[]){
	BankAccount obj = new BankAccount();
	obj.run();

   }

}