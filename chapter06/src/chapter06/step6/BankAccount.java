package chapter06.step6;

public class BankAccount {
	private String name;
	private long accountNum;
	private long balance;
	private double interestRate;
	
	public BankAccount() {

	}
	public BankAccount(String name, long accountNum, long balance, double interestRate) {
		this.name = name;
		this.accountNum = accountNum;
		this.balance = balance;
		this.interestRate = interestRate;
	}
}
