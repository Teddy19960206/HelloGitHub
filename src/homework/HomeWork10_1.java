package homework;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.*;

public class HomeWork10_1 {
	public static void main(String[] args) {
		// • 請設計一隻程式，用亂數產生5個介於1～100之間的整數，而輸出結果可以判斷出這5個整數為是否
		//   為質數(提示：Math類別)
		int r;
		Set<Integer> set = new HashSet<Integer>();
		while(set.size()<5) {
			set.add((int)(Math.random() * 100) + 1);
		}
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			r = it.next();
			if(r != 1 && r % 2 != 0 && r % 3 != 0 && r % 5 != 0 && r % 7 != 0 || r == 2 || r == 3 || r == 5 || r == 7) {
				System.out.println( r +"是質數");
			}
			else {
				System.out.println( r +"不是質數");
			}
		}
		
		
		
		
		
	}
}

