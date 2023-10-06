package homework;

import java.util.Scanner;

public class HomeWork3_2_1 {
	public static void main(String[] args){
		// 2.請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
		//   對則顯示正確訊息
		System.out.println("請猜一個0~9的數字:");
		int r = (int) (Math.random() * 10);
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a != r) {
			System.out.println("答錯了 請繼續猜!");
			 a = sc.nextInt();
		}
		System.out.println("恭喜答對囉!");
		sc.close();
	}
}
