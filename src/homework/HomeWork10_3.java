package homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class HomeWork10_3 {
	// • 請設計一隻程式，讓使用者輸入日期(年月日，例如:20110131)後，可以轉成想要的輸出格式化成
	// (1)年/月/日(2)月/日/年(3)日/月/年三選一，而輸入非指定日期數字格式會顯示出提示訊息如圖
	// (提示：TestFormatter.java, Java API文件，判斷格式可用正規表示法)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("請輸入西元年月日日期");
			String str = sc.next();
			int y = Integer.parseInt(str.substring(0, 4));
			Year year =Year.of(y);
			if ((year.isLeap()&&str.matches("^(?!0000)[0-9]{4}(((0[13578])(0[1-9]|[12][0-9]|3[01]))|((0[469])(0[1-9]|[12][0-9]|(30)))|((11)(0[1-9]|[12][0-9]|(30)))|((1[02])(0[1-9]|[12][0-9]|3[01]))|((02)(0[1-9]|[12][0-9])))$"))
					||(!(year.isLeap())&&str.matches("^(?!0000)[0-9]{4}(((0[13578])(0[1-9]|[12][0-9]|3[01]))|((0[469])(0[1-9]|[12][0-9]|(30)))|((11)(0[1-9]|[12][0-9]|(30)))|((1[02])(0[1-9]|[12][0-9]|3[01]))|((02)(0[1-9]|[12][0-8])))$"))) {
				System.out.println("請選擇表示方法(1)年/月/日(2)月/日/年(3)日/月/年");
				int num = sc.nextInt();
				switch (num) {
				case 1:
					formatYMD(str);
					break;
				case 2:
					formatMDY(str);
					break;
				case 3:
					formatDMY(str);
					break;
				default:
					System.out.println("請輸入有效的選擇 (1 or 2 or 3)");
				}
			} else {
				System.out.println("日期不存在，請重新輸入");
			}
		}
	}

	private static void formatYMD(String date) {
		String formattedDate = date.substring(0, 4) + "/" + date.substring(4, 6) + "/" + date.substring(6);
		System.out.println(formattedDate);
	}

	private static void formatMDY(String date) {
		String formattedDate = date.substring(4, 6) + "/" + date.substring(6) + "/" + date.substring(0, 4);
		System.out.println(formattedDate);
	}

	private static void formatDMY(String date) {
		String formattedDate = date.substring(6) + "/" + date.substring(4, 6) + "/" + date.substring(0, 4);
		System.out.println(formattedDate);
	}

}

