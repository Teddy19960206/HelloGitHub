package homework;

class EatThread extends Thread {
	private String name;
	private String n;
	
	public EatThread(String name,String n) {
		this.name = name;
		this.n = n;
	}
	
//	public EatThread(String name) {
//		this(name,"");
//	}

	public void run() {
		while(!HomeWork9_1.Start) {
			
		}
		// • 每個動作都以Thread.sleep()暫停一下,以達到顯示效果。
		//   Sleep時間由亂數產生500～3000之間的毫秒數
		for (int i = 1; i <= 10; i++) {
			int r = (int) (Math.random() * 2501) + 500;
			System.out.println(n + name + "吃第" + i + "碗飯");

			try {
				Thread.sleep(r);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}	
		System.out.println(n + name+"已經吃完囉");
		
	}	
}

public class HomeWork9_1 {
	// • 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
	// 競賽過程。
	public static boolean Start = false;
	
	public static void main(String[] args) {
		System.out.println("-----大胃王快食比賽開始!-----");
		EatThread et1 = new EatThread("饅頭人","");
		Thread t1 = new Thread(et1);
		EatThread et2 = new EatThread("詹姆士","\t\t");
		Thread t2 = new Thread(et2);
		
		t1.start();
		t2.start();
		Start = true;
		try {
			t1.join();
			t2.join();
			System.out.println("-----大胃王快食比賽結束!-----");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
