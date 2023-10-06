package homework;

public class HomeWork5_2 {
	// 2.請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值

	static void getRandom(){
		int x[] = new int[101];
		int sum = 0;
		for(int i = 0; i < 101; i++) {
			x [i] = i;
		}
		System.out.println("本次亂數結果:");
		for (int i = 0; i < 10; i++) {
			int r = (int)(Math.random()* 101);
			if (x[r] != -1) {
				System.out.print(x[r]+" ");
				sum += x[r];
				x[r] = -1;
			}
		}
		System.out.println();
		System.out.println("平均值是:"+(sum/10));
		
	}
	
	public static void main(String[] args) {
		
		getRandom();
	}

}
