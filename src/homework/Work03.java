package homework;

public class Work03 {	
//	public void setIntArry(int intArray[][]) {
//		this.intArray = intArray;
//	}
//	
//	public void setDoubleArry(double doubleArray[][]) {
//		this.doubleArray = doubleArray;
//	}
	
	public int maxElement(int [][]intArray) {
		int max = 0;
		for(int i = 0 ; i < intArray.length ; i++ ) {
			for(int j = 0 ; j < intArray[i].length ; j++) {
				if( intArray[i][j] >= max ) {
					max = intArray[i][j];
				}
			}
		}
		return max;
	}
	
	public double maxElement(double [][]doubleArray) {
		double max = 0;
		for(int i = 0 ; i < doubleArray.length ; i++ ) {
			for(int j = 0 ; j < doubleArray[i].length ; j++) {
				if( doubleArray[i][j] >= max ) {
					max = doubleArray[i][j];
				}
			}
		}
		return max;
	}
}
