package xxx;

public class PolyAnimal{
	public static void main(String[] args) {
		Animal a[]= new Animal[3];
		a[0]=new Elephant(3,1000.0f,"小象");
		a[1]=new Animal(5,200.0f);
		a[2]=new Elephant(8,5000.0f,"大象");
		for(int i = 0; i < a.length; i++) {
			a[i].speak();
		}

		}
	
	}
