package homework;

public class HomeWork4_1 {
	public static void main(String[] args) {
		// 1.有個一維陣列如下：
		//   {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
		//   請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		int [] a = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int i=0,j=0;
		float sum=0;
		for (i=0; i<a.length; i++) {
			sum +=  a[i];
		}
		System.out.println("平均值是"+(sum/a.length));
		
		System.out.print("大於平均值的有:");
		for (j=0; j<10; j++) {
			if(a[j]>(sum/i)) {
				System.out.print(a[j]+" ");
			}
		}
	}
}
