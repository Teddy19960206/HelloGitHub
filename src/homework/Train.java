package homework;

import java.util.Objects;

public class Train implements Comparable<Train>{
	//  • 請設計一個Train類別，並包含以下屬性：
	//  - 班次number，型別為int - 車種type，型別為String - 出發地start，型別為String
	//  - 目的地dest，型別為String - 票價price，型別為double
	//  • 設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題
	//    需使用的集合裡
	//  - (202, “普悠瑪”, “樹林”, “花蓮”, 400)
	//  - (1254, “區間”, “屏東”, “基隆”, 700)
	//	- (118, “自強”, “高雄”, “台北”, 500)
	//	- (1288, “區間”, “新竹”, “基隆”, 400)
	//	- (122, “自強”, “台中”, “花蓮”, 600)
	//	- (1222, “區間”, “樹林”, “七堵”, 300)
	//	- (1254, “區間”, “屏東”, “基隆”, 700)
	
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public Train(int number,String type,String start,String dest,double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getType() {
		return type;
	}
	
	public String getStart() {
		return start;
	}
	
	public String getDest() {
		return dest;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setNumber() {
		this.number = number;
	}
	
	public void setType() {
		this.type = type;
	}
	
	public void setStart() {
		this.start = start;
	}
	
	public void setDest() {
		this.dest = dest;
	}
	
	public void setPrice() {
		this.price = price;
	}
	
	public String toString() {
		return String.format("班次:%-5d\t車種:%-5s\t出發地:%-5s\t目的地:%-5s\t票價:%-5.2f",
	            number, type, start, dest, price);
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}
	public int compareTo(Train train1) {
		if(this.number < train1.number) {
			return 1;
		}
		else if(this.number == train1.number) {
			return 0;
		}
		else {
			return -1;
		}
	}
//	public static void main(String[] args) {
				
		
		
//		Set<Train> trainSet = new HashSet();
//		trainSet.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
//		trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700));
//		trainSet.add(new Train(118, "自強", "高雄", "台北", 500));
//		trainSet.add(new Train(1288, "區間", "新竹", "基隆", 400));
//		trainSet.add(new Train(122, "自強", "台中", "花蓮", 600));
//		trainSet.add(new Train(1222, "區間", "樹林", "七堵", 300));
//		trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700));
//		
//		List<Train> trainList = new ArrayList();
//		trainList.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
//		trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));
//		trainList.add(new Train(118, "自強", "高雄", "台北", 500));
//		trainList.add(new Train(1288, "區間", "新竹", "基隆", 400));
//		trainList.add(new Train(122, "自強", "台中", "花蓮", 600));
//		trainList.add(new Train(1222, "區間", "樹林", "七堵", 300));
//		trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));
//		
//		Set<Train> trainTreeSet = new TreeSet();
//		trainTreeSet.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
//		trainTreeSet.add(new Train(1254, "區間", "屏東", "基隆", 700));
//		trainTreeSet.add(new Train(118, "自強", "高雄", "台北", 500));
//		trainTreeSet.add(new Train(1288, "區間", "新竹", "基隆", 400));
//		trainTreeSet.add(new Train(122, "自強", "台中", "花蓮", 600));
//		trainTreeSet.add(new Train(1222, "區間", "樹林", "七堵", 300));
//		trainTreeSet.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
//	}
}
