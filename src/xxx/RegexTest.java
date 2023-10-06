package xxx;

import java.util.Scanner;

public class RegexTest {
	public static void main(String[] args) {
		String regex = "^[A-Za-z][12]\\d{8}$";
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		if(a.matches(regex)) {
			System.out.println("GOOD!");
		}
		else {
			System.out.println("BAD!");
		}
		
	}
}
