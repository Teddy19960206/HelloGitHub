package xxx;

public class CubeTest{
	public static void main(String[] args) {
		
	
			try {
				//Cube c = new Cube(0);
				
				Cube c = new Cube();
				c.setLength(-2);
				System.out.println(c.getVolume());
			} catch (CubeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			
			
		
		
	}
}
