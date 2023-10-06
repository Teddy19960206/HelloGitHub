package homework;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class HomeWork10_2 {
	public static void main(String[] args) {
		// • 請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種表示方法顯示
		// (1)千分位(2)百分比(3)科學記號，而輸入非任意數會顯示提示訊息如圖
		// (提示： TestFormatter.java, Java API文件, 判斷數字可用正規表示法)
		// • 補充(依此類推)：
		// 輸入12345，千分位為12,345，輸入123，千分位為123
		// 輸入0.75，百分比為75%，輸入1，結果為100%
		
		while (true) {
			
			System.out.println("請輸入一個任意數");
			Scanner sc = new Scanner(System.in);
			String num = sc.next();
			
			if (num.matches("^[0-9]+$") || num.matches("^0.[0-9]+$")) {
				System.out.println("請選擇表示方法(1)千分位(2)百分比(3)科學記號");
				int b = sc.nextInt();
				double num2 = Double.parseDouble(num);
				if (b == 1) {
					Format dfm1 = new DecimalFormat("#,###.###");
					System.out.println(dfm1.format(num2));
				} else if (b == 2) {
					if (num2 <= 1) {
						Format dfm2 = new DecimalFormat("0.###%");
						System.out.println(dfm2.format(num2));
					}
				} else if (b == 3) {
					Format dfm2 = new DecimalFormat("0.#E00");
					System.out.println(dfm2.format(num2));
				}else {
					System.out.println("無此方法，請重新輸入");	
					continue;
				}
			} else {
				System.out.println("請重新輸入表示方法");				
			}continue;
		}
	}
}
