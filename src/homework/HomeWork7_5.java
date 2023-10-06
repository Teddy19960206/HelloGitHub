package homework;

import java.io.*;

public class HomeWork7_5 {
	public static void main(String[] arg) throws IOException{
	// 5.承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何
	//   (請利用多型簡化本題的程式設計)
		File object = new File("C:\\data\\Object.ser");
		FileInputStream fis = new FileInputStream(object);
		ObjectInputStream ois = new ObjectInputStream(fis);
			
		while(true) {
			try {
				((Animal)ois.readObject()).speak();
			} catch (ClassNotFoundException | IOException e) {
				
				break;
			}
		}
		ois.close();
		fis.close();
	}
}
