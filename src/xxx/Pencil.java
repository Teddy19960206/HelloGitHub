package xxx;

public class Pencil extends Pen{

	public  void write() {
		System.out.println("削鉛筆再寫");
	}
	
	public double getPrice() {
		double penPrice = super.getPrice();
		return penPrice * 0.8;
	}
}
