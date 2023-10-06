package homework;

import java.io.*;
import java.util.*;


public class HomeWork7_2 {
	public static void main(String[] args) throws IOException {
	// 2.請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡(請使用
	//   append功能讓每次執行結果都能被保存起來)	
		Set set = new HashSet();
		int i = 0;
		while(set.size() < 10) {
			set.add((int)(Math.random() * 1000) + 1);
		}
		
		FileOutputStream data = new FileOutputStream("files\\Data.txt",true);
		PrintStream ps = new PrintStream(data);
		
		Iterator it = set.iterator();
		while (it.hasNext()) {
			ps.print(it.next()+"\t");
		}
		ps.println();
		
		ps.close();
		data.close();
	
		
		
	}
}
