package homework;

import java.util.Scanner;

public class HomeWork4_4 {
	public static void main(String[] args) {
		// 4.阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5 個,其員工編號與身上現金列
		//   表如下：
		//   員工編號		25		32		8		19		27
		//   身上現金	   2500	    800	   500	   1000    1200
		
		//   請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
		//   有錢可借他;並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的
		//   員工編號: 25 19 27 共3 人!」
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [][]b= {{25,2500},{32,800},{8,500},{19,1000},{27,1200}};
		int count = 0;
		sc.close();
		System.out.print("有錢可借的員工編號:");
		for(int i = 0; i < b.length; i++) {
			if(a <= b[i][1]) {
				count++;
				System.out.print(b[i][0]+" ");
			}
		}
		if (count > 0) {
			System.out.println("共"+count+"人");
		}
		else {
			System.out.println("無");
		}
	
	}
}
