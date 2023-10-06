package homework;

import java.util.Scanner;

public class HomeWork3_3 {
	public static void main(String[] args){
		/// 3.阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
		//    厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
		//    的號碼與總數
		//    進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複
		System.out.println("請輸入不想要的數字:");
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int m=0,n=0,o=0;
		for (m=0; m<5; m++) {
			if(m != p) {
				for(n=0; n<10;n++) {
					if(n != p) {
						if(m != 0 || n != 0) { 
							System.out.print(10*m+n+" ");
							o++;
						}	
					}
				}
			}
		}
		System.out.println();
		System.out.println("共"+o+"個");
		sc.close();
		
		System.out.println("==================");
		int s=1,q[]=new int[o],x,y,z=0;
		
		for (x=0; x<5; x++) {
			if(x != p) {
				for(y=0; y<10; y++) {
					if(y != p) {
						if(x != 0 || y != 0) {
							q[z]=10*x+y;
							z++;
						}	
					}
				}
			}
		}
		
		while(s<=6) {
			int r = (int) (Math.random() * o);
			if(q[r] != 0){
				System.out.print(q[r]+" ");
				q[r] = 0;
				s++;
			}	
		}
		System.out.println();
		System.out.println("==================");
		
		
		
		
	}
}
