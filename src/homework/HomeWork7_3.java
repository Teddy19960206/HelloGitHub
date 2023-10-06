package homework;

import java.io.*;

public class HomeWork7_3 {
	public static void main(String[] args) throws IOException {
		// 3.請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。
		//   呼叫此方法時，第一個參數所代表的檔案會複製到第二個參數代表的檔案
		File f1 = new File(".//files//Sample.txt");
		File f2 = new File(".//files//SampleCopy.txt");
		copyFile(f1,f2);
		}
	public static void copyFile(File file1, File file2) throws IOException {
		FileReader fr = new FileReader(file1);
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter(file2);
		BufferedWriter bw = new BufferedWriter(fw);
		int a;
		while((a = br.read()) != -1) {
			bw.write(a);
			bw.flush();
		}
		bw.close();
		fw.close();
		br.close();
		fr.close();
	}
}
