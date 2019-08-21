package chapter05;

public class CountVowel {
	String string;
	int countVowel;
	int countConsonant;

	public CountVowel() {
		this.string = null;
		this.countVowel = 0;
		this.countConsonant = 0;
	}

	public CountVowel(String string) {
		this.string = string;
		this.countVowel = 0;
		this.countConsonant = 0;
	}

	public void countVowel() {
		for (int i = 0; i < this.string.length(); i++) {
			switch (this.string.charAt(i)) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
				this.countVowel++;
				break;
			default:
				this.countConsonant++;
				break;
			}
	}
	System.out.printf("모음은 %d개, 자음은 %d개 입니다. \n", this.countVowel, this.countConsonant);
	}
}
