package homework;

public class HomeWork5_5 {
	// 5.身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
	//   genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
	//   與數字的亂數組合
	static void genAuthCode(){
		
		int r = (int)(Math.random() * 3);
		int r1 = (int)(Math.random() * 10);
		int r2 = (int)(Math.random() * 26);
		int r3 = (int)(Math.random() * 26);
		int a, b, c;
		String authCode;
		
		do {
			a = b = c = 0;
			authCode = "";
			for(int i = 0; i < 8 ; i++) {
				r = (int)(Math.random() * 3);
				if(r == 0) {
					r1 = (int)(Math.random() * 10);
					char ch = (char)('0' + r1);
					authCode = authCode + ch;
					a++;
				}
			
				if(r == 1) {
					r2 = (int)(Math.random() * 26);
					char ch =(char)('A'+ r2);
					authCode = authCode + ch;
					b++;
				}
			
				if(r == 2) {
					r3 = (int)(Math.random() * 26);
					char ch =(char)('a'+ r3);
					authCode += ch;
					c++;
				}	
			
			}
		}while (a*b*c == 0);
		System.out.print(authCode);
		
	}
	public static void main(String[] args) {
		
		genAuthCode();
		
	}
	
	




}
