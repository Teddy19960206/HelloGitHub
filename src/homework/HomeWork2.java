package homework;

public class HomeWork2 {
	public static void main(String[] args) {
	// 1.請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int i,sum = 0;
		for(i=0;i<=1000;i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		
		System.out.println("======================");
	// 2.請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int j,pro = 1;
		for(j=1; j<=10; j++) {
			pro = pro * j;
		}
		System.out.println(pro);
		
		System.out.println("======================");
	// 3.請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int k = 1, pro2 = 1;
		while(k<=10){
			pro2 *= k;
			k++;
		}
		System.out.println(pro2);
		
		System.out.println("======================");
	// 4.請設計一隻Java程式，輸出結果為以下：
	//   1 4 9 16 25 36 49 64 81 100
		int l = 1;
		for(l = 1; l <= 10; l++) {
			System.out.printf("%.0f ",Math.pow(l, 2));
		}
		System.out.println();
		System.out.println("======================");
	// 5.阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
	//   輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int m=0,n=0,o=0;
		for (m=0; m<5; m++) {
			if(m != 4) {
				for(n=0; n<10;n++) {
					if(n !=4) {
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
		
		System.out.println("======================");
	// 6.請設計一隻Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		int p,q;
		for(p=10; p>0; p--) {
			for(q=1 ;q <= p; q++) {
				System.out.print(q+" ");
			}
			System.out.println();	
		}
		
		System.out.println("======================");
	// 7.請設計一隻Java程式，輸出結果為以下：
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
		
		int r,s; //好方法
		for(r=0; r < 6; r++) {
			for(s=0; s <= r; s++) {
				char ch =(char)('A'+ r);
				System.out.print(ch);
			}
			System.out.println();
		}
		
//		int r,s; //破方法
//		for(r=1; r <= 6; r++) {
//			for(s=1; s <= r; s++) {
//				switch (r) {
//				case 1:
//					System.out.print("A");
//					break;
//				case 2:
//					System.out.print("B");
//					break;
//				case 3:
//					System.out.print("C");
//					break;
//				case 4:
//					System.out.print("D");
//					break;
//				case 5:
//					System.out.print("E");
//					break;
//				case 6:
//					System.out.print("F");
//					break;
//				}
//			}
//			System.out.println();
//		}
//		
	}
}
