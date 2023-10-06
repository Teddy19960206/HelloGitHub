package xxx;

public class Test4Numbers {
	public static void main(String[] args) {
		int num1;
		for(num1=0;num1<=100;num1++) {
			if(num1 % 4 == 0)
				System.out.print(num1 +" ");
		}
		System.out.println();
		int num2=0;
		while(num2<=100) {
			if(num2 % 4 == 0)
				System.out.print(num2 +" ");
			num2 = num2 + 4;	
		}
		System.out.println();
		int num3=0;
		do {
			if(num3 % 4 == 0)
				System.out.print(num3 +" ");
			num3 = num3 + 4;
			}while (num3<=100);
	}
}
