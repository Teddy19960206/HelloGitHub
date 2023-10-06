package xxx;

public class AnimalTest {
	public static void main(String[] args) {
		
//		Animal a = new Animal(2,5.0f);
//		a.speak();
//		
//		System.out.println("過了三年");
//		
//		a.setAge(5);
//		a.setWeight(25);
//		a.speak();
		
		Animal a1 = new Animal(3, 8.0f);
		Elephant a2 =new Elephant(8, 1200.0f, "大象");
		
		a1.speak();
		a2.speak();
	}
}
