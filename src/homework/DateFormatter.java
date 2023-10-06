package homework;

import static java.lang.System.out;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DateFormatter {
	
	public static void main(String[] args) throws ParseException {
		System.out.println("請輸入日期(年月日，例如：20110131)：");
		Scanner sc = new Scanner(System.in);
		while(true) {
			String input = sc.next();
			if (!isRegex(input)) {
				System.out.println("日期格式不正確，請再輸入一次！");
			} else {
				System.out.print("欲格式化成(1)年/月/日 (2)月/日/年 (3)日/月/年：");
				int fm = sc.nextInt();
				SimpleDateFormat ymd = new SimpleDateFormat("yyyyMMdd");
				Date output = ymd.parse(input);
				switch (fm) {
				case 1 :
					Format f1 = new SimpleDateFormat("yyyy/MM/dd");
					out.println("年/月/日：" + f1.format(output));
					break;
				case 2 :
					Format f2 = new SimpleDateFormat("MM/dd/yyyy");
					out.println("月/日/年：" + f2.format(output));
					break;
				case 3 :
					Format f3 = new SimpleDateFormat("dd/MM/yyyy");
					out.println("日/月/年：" + f3.format(output));
					break;
				default :
					out.println(fm + "為無效選項，年月日：" + input);
				}
				break;
			}
		}
		sc.close();
	}
	
	public static boolean isRegex(String value) {
		int y = Integer.parseInt(value.substring(0, 4));
		int m = Integer.parseInt(value.substring(4, 6));
		int d = Integer.parseInt(value.substring(6));
		Year year = Year.of(y);
		Pattern pattern = Pattern.compile("^((?!0000)[0-9]{4})(((0[13578]|1[02])(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)(0[1-9]|[12][0-9]|30))|(02(0[1-9]|[12][0-9]))|(02)())$");
		if (pattern.matcher(value).matches()) {
			if (!year.isLeap() && m == 2 && d > 28) {
				return false;
			}
		    return true;
		} else {
			return false;
		}
	}

}
