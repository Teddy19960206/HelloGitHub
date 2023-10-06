package homework;

import java.util.Scanner;

public class HomeWork3_2_2 {
	public static void main(String[] args){
		// 產生0～100亂數，每次猜就會提示你是大於還是小於正確答案
		System.out.println("請猜一個0~100的數字:");
		int r = (int) (Math.random() * 101);
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a != r) {
			if(a > r) {
				System.out.println("數字比答案大");
				a = sc.nextInt();
			}
			else if(a < r){
				System.out.println("數字比答案小");
				a = sc.nextInt();
			}
		}
		System.out.println("恭喜答對囉!");
		sc.close();
	}

}
