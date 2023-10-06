package homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3_1 {
	public static void main(String[] args){
		// 1.請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
		//   三角形、其它三角形或不是三角形
		//   進階功能：加入直角三角形的判斷
		System.out.println("請輸入三個正整數:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int []x = {a,b,c};
		Arrays.sort(x);
		if(x[0]+x[1]<=x[2]) {
			System.out.println("這不是三角形");
		} 
		else {
			if(x[0] == x[1] && x[1] == x[2]){
				System.out.println("這是正三角形");
			}
			else if(x[0] == x[1] && x[1] != x[2]) {
				System.out.println("這是等腰三角形");
			}
			else if(x[2] == x[1] && x[1] != x[0]) {
				System.out.println("這是等腰三角形");
			}
			else {
				if(Math.pow(x[0], 2) + Math.pow(x[1], 2) == Math.pow(x[2], 2)) {
					System.out.println("這是直角三角形");
				}
				else {
					System.out.println("這是其他三角形");
				}
			}
		}
	}
}
