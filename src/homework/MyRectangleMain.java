package homework;

public class MyRectangleMain {
	// 4.請另外建立一個MyRectangleMain類別，此類別只有main方法
	//   (1) 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，
	//   透過getArea()印出結果
	//   (2) 使用public MyRectangle(double width, double depth)建構子建立物件，
	//   設定width, depth為10, 20，透過getArea()印出結果
	public static void main(String[] args) {
		
		MyRectangle mr = new MyRectangle();
		mr.setWidth(10);
		mr.setDepth(20);
		System.out.println(mr.getArea());
		
		MyRectangle mr2 = new MyRectangle(30,20);
		System.out.println(mr2.getArea());
		
	}
	
}
