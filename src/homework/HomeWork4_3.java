package homework;

public class HomeWork4_3 {
	public static void main(String[] args) {
		// 3.有個字串陣列如下(八大行星)：
		//   {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
		//   請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		String s[] = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count = 0;
		for(int i = 0; i <s.length; i++) {
			for(int j = 0; j < s[i].length(); j++) {
				if(s[i].charAt(j)=='a' || s[i].charAt(j)=='e' || s[i].charAt(j)=='i' || s[i].charAt(j)=='o' || s[i].charAt(j)=='u') {
					count++;
				}
			}
		}
		System.out.println("共有"+count+"個母音");
	}
}
