package homework;

import java.util.*;

public class TrainTest {
	public static void main(String[] args) {
	// 	• 請寫一隻程式，能印出不重複的Train物件
		Set<Train> trainSet = new HashSet<>();
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3= new Train(118, "自強", "高雄", "台北", 500);
		Train t4= new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		
		trainSet.add(t1);
		trainSet.add(t2);
		trainSet.add(t3);
		trainSet.add(t4);
		trainSet.add(t5);
		trainSet.add(t6);
		trainSet.add(t7);
		
//		Train[] trainArray = new Train[7];
//		trainArray [0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
//		trainArray [1] = new Train(1254, "區間", "屏東", "基隆", 700);
//		trainArray [2]= new Train(118, "自強", "高雄", "台北", 500);
//		trainArray [3]= new Train(1288, "區間", "新竹", "基隆", 400);
//		trainArray [4] = new Train(122, "自強", "台中", "花蓮", 600);
//		trainArray [5] = new Train(1222, "區間", "樹林", "七堵", 300);
//		trainArray [6] = new Train(1254, "區間", "屏東", "基隆", 700);
//		
//	    Collections.addAll(trainSet, trainArray); 
//		也可使用註記方法把放入陣列的物件放入集合中，下面再次放入就只要輸入修改上面這行即可
		
		Iterator<Train> obj = trainSet.iterator();
		while(obj.hasNext())
			System.out.println(obj.next());
		System.out.println("===========================================================================");
	// 	• 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
		List<Train> trainList = new ArrayList<>();
		
		trainList.add(t1);
		trainList.add(t2);
		trainList.add(t3);
		trainList.add(t4);
		trainList.add(t5);
		trainList.add(t6);
		trainList.add(t7);
		
//	    Collections.addAll(trainList, trainArray); 
		
		Collections.sort(trainList);
		
		for (int i = 0 ; i < trainList.size(); i++) {
			System.out.println(trainList.get(i));
		}
		System.out.println("===========================================================================");
	//	• 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
		Set<Train> trainTreeSet = new TreeSet<>();
		
		trainTreeSet.add(t1);
		trainTreeSet.add(t2);
		trainTreeSet.add(t3);
		trainTreeSet.add(t4);
		trainTreeSet.add(t5);
		trainTreeSet.add(t6);
		trainTreeSet.add(t7);
		
//	    Collections.addAll(trainTreeSet, trainArray); 
		
		for(Train train: trainTreeSet) {
			System.out.println(train);
		}
	}
}
