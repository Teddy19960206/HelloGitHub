package homework;

//2.熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領
//	  錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
//	  3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元
//	  以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
//	  大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢
//	  已經入帳戶。假設媽媽一次匯款2000 元,熊大一次提款
//	  1000元,寫一個Java程式模擬匯款10次與提款10次的情
//	  形。

class Money{
	private int mm = 0;
	
	synchronized public void spend(int water) {
		while(mm<water) {
			System.out.println("錢不夠花了啦,等你媽匯錢");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		mm -= water;
		System.out.println("花費: "+ water + "存款還有:"+ mm);
		if (mm<2000) {
			System.out.println("存款不足,停止花費");
			notify();
		}
	}
	
	synchronized public void earn(int water) {
		while(mm>3000) {
			System.out.println("存款充足,繼續花錢");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		mm += water;
		System.out.println("存入: "+ water + "存款還有:"+ mm);
		notify();	
	}
}

class Bear extends Thread{
	Money money;
	
	public Bear(Money money) {
		this.money = money;
	}
	
	public void run() {
		for(int i=0; i<10; i++) {
			money.spend(1000);
		}
	}
}

class BearMom extends Thread{
	Money money;
	
	public BearMom(Money money) {
		this.money = money;
	}
	
	public void run() {
		for(int i=0; i<10; i++) {
			money.earn(2000);
		}
	}
}


public class HomeWork9_2 {
	public static void main(String[] args) {
		Money money = new Money();
		Bear bear = new Bear(money);
		BearMom bearmom = new BearMom (money);
		
		bear.start();
		bearmom.start();
	}
}
