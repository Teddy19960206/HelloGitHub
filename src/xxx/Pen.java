package xxx;

public abstract class Pen {
	private String brand;
	private int price;

	public Pen() {
		
	}
	
	public Pen(String brand,int price) {
		this.brand = brand;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public abstract void write();
	
}
