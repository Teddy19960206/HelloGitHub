package homework;

import java.io.*;

public class HomeWork7_4 {
	
	public static void main(String[] args) throws IOException {
		// 4.請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。
		//   注意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
		File data = new File("C:\\data");
		File object = new File(data,"Object.ser");
		data.mkdir();
		Object obj[] = new Object[4];
		obj[0] = new Dog("Maru");
		obj[1] = new Cat("Sasa");
		obj[2] = new Cat("Orange");
		obj[3] = new Dog("Teddy");
		
		FileOutputStream fos = new FileOutputStream(object);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		int i = 0;
		while ( i < obj.length){
			oos.writeObject(obj[i]);
			i++;
		}
		
		oos.close();
		fos.close();
	}
	
}
