package xxx;

public class InkBrush extends Pen{

	public  void write() {
		System.out.println("沾墨汁再寫");
	}
	
	public double getPrice() {
		double inkBrushPrice = super.getPrice();
		return inkBrushPrice * 0.9;
	}
	
}
