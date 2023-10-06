package homework;

import java.io.*;

public class HomeWork7_1 {
	public static void main(String[] args) throws IOException {
		// 1.請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
		//   Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
		File f = new File(".\\files\\Sample.txt");
		FileReader fr = new FileReader(f);
		FileReader fr2 = new FileReader(f);
		BufferedReader br2 = new BufferedReader(fr2);
		int i = 0 , j = 0;
		
		while (fr.read() != -1)
            i++;
        
		while (br2.readLine() != null)
			j++;
		
		br2.close();
		fr2.close();
		fr.close();
		System.out.println("Sample.txt檔案共有 " + f.length() + " 個位元組，" + i + " 個字元，" + j + " 列資料");
	}
}
