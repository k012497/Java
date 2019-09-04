package chapter14.ex16;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		acc1.deposit(100_000); // 10만원 입금 
		try {
			acc1.withdraw(200_000); // 20만원 인출
		} catch (NegativeBalanceException e) {
			System.out.println("잔액이 부족합니다 ");
		}

	}

}
