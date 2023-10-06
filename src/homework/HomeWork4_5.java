package homework;

import java.util.Scanner;

public class HomeWork4_5 {
	public static void main(String[] args) {
		// 5.請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
		//   例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
		System.out.println("請輸入三個整數 分別是西元年 月 日:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int [][]d = {{1,31},{2,28},{3,31},{4,30},{5,31},{6,30},{7,31},{8,31},
				{9,30},{10,31},{11,30},{12,31}};
		int sum=0;
		if ( b <= d.length && c >0 && b > 0 && a >= 0) {
			if ( a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
				d[1][1] = 29;
				if(d[b-1][1]>=c) {
					for(int i = 0; i < b-1 ; i++) { 
						sum += d[i][1];
					}
					sum = sum + c;
					System.out.println(a+"/"+b+"/"+c+"是"+a+"年的第"+sum+"天");
				}
				else {
					System.out.println("不存在的日期");
				}
			}
			else {
				if(d[b-1][1]>=c) {
					for(int i = 0; i < b-1 ; i++) {
						sum += d[i][1];
					}
					sum = sum + c;
					System.out.println(a+"/"+b+"/"+c+"是"+a+"年的第"+sum+"天");
				}
				else {
					System.out.println("不存在的日期");
				}
			}
			}
		else {
			System.out.println("不存在的日期");
		}
	}
}
