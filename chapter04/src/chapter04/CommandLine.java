package chapter04;

public class CommandLine {

	public static void main(String[] args) {
		for (String str : args) {
			if (str.equals("-h")) {
				System.out.println("HELP");
			} else {
				System.out.println(str);
			}

		}
	}

}
