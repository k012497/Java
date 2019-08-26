package inheritance_Bank;

class Bank {
	double getInterestRate() {
		return 0.0;
	}
}

class BadBank extends Bank {
	double getInterestRate() {
		return 10.0;
	}
}

class NormalBank extends Bank {
	double getInterestRate() {
		return 5.0;
	}
}

class GoodBank extends Bank {
	double getInterestRate() {
		return 3.0;
	}
}

public class BankTest {
	public static void main(String[] args) {
		BadBank b1 = new BadBank();
		NormalBank b2 = new NormalBank();
		GoodBank b3 = new GoodBank();
	}
}
