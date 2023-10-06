package xxx;

public class TestNineNine {
	public static void main(String[] args) {
		
		int i;
		for(i=1; i<10; i++) {
			int j = 1;
			while(j < 10) {
				System.out.print(i + "*" + j + "=" + i*j +"\t");
				j++;
			}
			System.out.println();
		}
		
		int k;
		for(k=1; k<10; k++) {
			int l = 1;
			do {
				System.out.print(k + "*" + l + "=" + k*l +"\t");
				l++;
			} while(l < 10);
			System.out.println();
		}
		
		int m = 1;
		while(m < 10) {
			int n = 1;
			do {
				System.out.print(m + "*" + n + "=" + m*n +"\t");
				n++;
			} while (n < 10);
			m++;
			System.out.println();
		}
		
	}
}
