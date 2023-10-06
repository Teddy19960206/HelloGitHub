package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		boolean BL;
		
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("請輸入x的值:");
				int a = sc.nextInt();
				System.out.println("請輸入y的值:");
				int b = sc.nextInt();
				Calculator c = new Calculator();
				System.out.println(c.powerXY(a, b));
				BL = false;
				sc.close();
			}catch(CalException e){
				System.err.println(e.getMessage());
				BL = true;
			}catch(InputMismatchException e){
				System.err.println("輸入格式不正確");
				BL = true;
			}
		}while(BL);
	}
}
