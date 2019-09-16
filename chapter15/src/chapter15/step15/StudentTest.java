package chapter15.step15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentTest {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Student> std = new ArrayList<Student>();
		int index = 0;
		String name = null;
		std.add(new Student("kim", "D", "D"));
		std.add(new Student("kim", "Seoul", "010-0000-0000"));
		std.add(new Student("lim", "Busan", "010-1234-1234"));
		std.add(new Student("jim", "Seoul", "010-1111-2222"));
		std.add(new Student("bim", "Seoul", "010-3333-4444"));
		
		Iterator iter = std.iterator();
		while(iter.hasNext()) {
			Object obj = iter.next();
			System.out.println(obj);
		}
		
		//System.out.println(std.get(1).compareTo(2));
		
		System.out.println("=====SYSTEM MENU=====");
		System.out.println("1 add information");
		System.out.println("2 search information");
		System.out.println("3 delete information");
		System.out.println("=====================");
		System.out.print("please select menu NO. ");
		int menuNum = scan.nextInt();
		
		switch (menuNum) {
		case 1:
			System.out.print("enter data string with space(name, address, phone number): ");
			name = scan.next();
			String address = scan.next();
			String phoneNum = scan.next();
			std.add(new Student(name, address, phoneNum));
			break;
			
		case 2:
			System.out.print("enter index to find : ");
			index = scan.nextInt();
			System.out.println(std.get(index));
			break;
			
		case 3:
			System.out.print("enter index to delete : ");
			index = scan.nextInt();
			std.remove(index);
			break;

		default:
			break;
		}
		
		if(menuNum == 1 || menuNum == 3) {
			System.out.println("> > > > > > a f t e r > > > > > >");
			Iterator<Student> iter2 = std.iterator();
			while(iter2.hasNext()) {
				Student obj = iter2.next();
				System.out.println(obj);
			}
		}
		
		
		
				
	}

}
