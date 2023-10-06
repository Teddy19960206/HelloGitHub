package homework;

import java.util.Arrays;

public class HomeWork4_6 {
	public static void main(String[] args) {
		
		// 6.班上有8位同學，他們進行了6次考試結果如下：
		//         1號   2號   3號   4號   5號   6號   7號   8號	
		//   1考    10   35    40    100   90    85    75    70
		//   2考    37   75    77    89    64    75    70    95
		//   3考   100   70    79    90    75    70    79    90
		//   4考    77   95    70    89    60    75    85    89
		//   5考    98   70    89    90    75    90    89    90
		//   6考    90   80   100    75    50    20    99    75
		//   請算出每位同學考最高分的次數
		int [][]gra = {{10,35,40,100,90,85,75,70},{37,75,77,89,64,75,70,95},
				{100,70,79,90,75,70,79,90},{77,95,70,89,60,75,85,89},
				{98,70,89,90,75,90,89,90},{90,80,100,75,50,20,99,75}};
		int[][]a = new int[gra.length][];
		for (int l = 0; l < gra.length ; l++) {
			 a[l] = Arrays.copyOf(gra[l], gra[l].length);
		}
		int best[]= new int[gra.length];
		for(int i = 0; i < gra.length; i++) {
			Arrays.sort(a[i]);
			best[i] = a[i][gra[i].length-1];
		}
		int count = 0;
		for(int j = 0; j < gra[0].length ; j++) {
			count = 0;
			for(int k = 0; k < gra.length; k++) {
				if(best[k] == gra[k][j]) {
					count++;
				}
			}
			System.out.println(j+1+"號"+count+"次");
		}
	}

}
