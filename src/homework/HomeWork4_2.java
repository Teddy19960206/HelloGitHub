package homework;

//import java.util.Scanner;

public class HomeWork4_2 {
	public static void main(String[] args) {
		
		// 2.請建立一個字串，經過程式執行後，輸入結果是反過來的
		//   例如String s = “Hello World”，執行結果即為dlroW olleH
	
		String s = "Hello World";
		char []a = new char[s.length()];
		for (int i = 0; i < a.length ; i++) {
			a[i] = s.charAt(s.length()-1-i);
			System.out.print(a[i]);
		}
	
	    //以下為輸入字串，會讓字串結果反過來的code	
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		sc.close();
//		char []a = new char[s.length()];
//		for (int i = 0; i < a.length ; i++) {
//			a[i] = s.charAt(s.length()-1-i);
//			System.out.print(a[i]);
//		}
	}
}
