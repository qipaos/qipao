package StreamTask;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("张三 , 19");
		arr.add("张天东 , 22");
		arr.add("张开源 , 21");
		arr.add("张田田 , 15");
		arr.add("田七 , 19");
		ArrayList<String> arr1=new ArrayList<String>();
		for(String str : arr) {
			if(str.startsWith("张")) {
				arr1.add(str);
			}
		}
		for(String str: arr1) {
			System.out.println(str);
		}
		System.out.println("-------------");
		ArrayList<String> arr2=new ArrayList<String>();
		for(String str : arr1) {
			if(str.split(" , ")[0].length()>2) {
				arr2.add(str);
			}
		}
		for(String str : arr2) {
			System.out.println(str);
		}
		System.out.println("--------------");
		arr.stream().filter(s -> s.startsWith("张")).filter(s -> s.split(" , ")[0].length()>=3).forEach(s -> System.out.println(s));
	}
	

}
