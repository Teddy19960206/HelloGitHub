package homework;

public class HomeWork1{
	public static void main(String[] args) {
	// 1.請設計一隻Java程式，計算12，6這兩個數值的和與積		
		System.out.println("第一題");
		System.out.println("12 + 6 = " + (12+6));
		System.out.println("12 * 6 = " + (12*6));
		
		System.out.println("======================");
	// 2.請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		System.out.println("第二題");
		int eggs = 200;
		int dozon = eggs / 12;
		int pcs = eggs % 12;

		System.out.println("200顆蛋是"+dozon+"打"+pcs+"顆");
		
		System.out.println("======================");
	// 3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		System.out.println("第三題");
		int totalSec = 256559;
		int day = totalSec / 86400;
		int hour = (totalSec - day * 86400) / 3600;
		int minute = (totalSec - day * 86400 - hour * 3600) / 60;
		int sec = totalSec % 60;
		
		System.out.println("256559是"+day+"天"+hour+"小時"+minute+"分"+sec+"秒");
		
		System.out.println("======================");
	// 4.請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		System.out.println("第四題");
		final double PI = 3.1415;
		int radius = 5;
		
		System.out.printf("圓面積=%.2f%n",(radius*radius*PI));
		System.out.printf("圓周長=%.2f%n",(radius*2*PI));
	
	
	// 5.某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
	//	 金加利息共有多少錢(用複利計算，公式請自行google)
		System.out.println("第五題");
		double money = 1500000;
		int i;
		for (i=1; i<=10; i++) {
			money=money*1.02;
		}
		System.out.printf("本金加利息有%.2f元%n",money);
		
		System.out.println("======================");
		//請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
		//5 + 5
		//5 + ‘5’
		//5 + “5”
		//並請用註解各別說明答案的產生原因
		System.out.println("第六題");
		
		System.out.println("5 + 5 = "+ (5+5)); //數字5+數字5=數字10
		System.out.println("5 + '5' = "+ ( 5+'5')); //數字5和編碼表中5的編碼(53)加在一起
		System.out.println("5 + “5” = "+ (5 + "5") ); //數字5+字串"5"會把兩者連在一起
		
		}
	

}
