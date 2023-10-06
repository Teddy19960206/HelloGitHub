package xxx;

public class TestBMI {
	public static void main(String[] args) {
		// 建立身高體重的資料
		int height = 166;
		int weight = 56;
		// 運算BMI的數值,並顯示出來
		double bmi = weight / (height * 0.01 * height * 0.01);
		// double bmi = weight / Math.pow(height, 2);
		System.out.println("BMI = "+bmi);
		System.out.printf("BMI = %.2f%n",bmi); //format 格式 %f是浮點數資料 %n是換行
		// 根據BMI顯示結果
		if (bmi<18.5) {
			System.out.println("過瘦");
		}
		else if (bmi>=24) {
			System.out.println("過胖");
		}
		else {
			System.out.println("正常");
		}
	}

}
