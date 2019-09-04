package chapter14.ex16;

public class BankAccount {
	private long balance;
	
	public BankAccount() {
		this.balance = 0;
	}
	
	public long deposit(long money) {
		balance += money;
		return balance;
	}
	
	public long withdraw(long money) throws NegativeBalanceException {
		if(money > balance) throw new NegativeBalanceException();
		balance -= money;
		return balance;
	}

}
