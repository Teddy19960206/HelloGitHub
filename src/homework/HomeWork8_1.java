package homework;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class HomeWork8_1 {
	public static void main(String[] args) {
		// • 請建立一個Collection物件並將以下資料加入：
		//   Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、
		// 	 Integer(100)、Object物件、“Snoopy”、BigInteger(“1000”)	
		Collection c = new ArrayList();
		
		c.add(new Integer(100));
		c.add(new Double(3.14));
		c.add(new Long(21L));
		c.add(new Short("100"));
		c.add(new Double(5.1));
		c.add("Kitty");
		c.add(new Integer(100));
		c.add(new Object());
		c.add("Snoopy");
		c.add(new BigInteger("1000"));
		
		// • 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		Iterator it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("==================");
		
		for(int i = 0; i < c.size(); i++) {
			Object obj = ((ArrayList) c).get(i);
			System.out.println(obj);
		}
		System.out.println("==================");
		
		for(Object obj : c) {
			System.out.println(obj);
		}
		System.out.println("==================");
		
		// • 移除不是java.lang.Number相關的物件
		Iterator it2 = c.iterator();
		while(it2.hasNext()) {
			if(!(it2.next() instanceof Number)) {
				it2.remove();
			}
		}
		// • 再次印出這個集合物件的所有元素，
		//   觀察是否已將非Number相關的物件移除成功
		it2 = c.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}	
	}
}
