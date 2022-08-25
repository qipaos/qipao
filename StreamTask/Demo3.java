package StreamTask;

import java.util.ArrayList;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("10");
		arr.add("20");
		arr.add("30");
		arr.add("40");
//		arr.stream().map(s -> Integer.parseInt(s)).forEach(System.out::println);
//		arr.stream().map(Integer::parseInt).forEach(System.out::println);
//		arr.stream().mapToDouble(s -> Integer.parseInt(s)).forEach(System.out::println);
//		int total=arr.stream().mapToInt(Integer::parseInt).sum();
//		System.out.println(total);
		
		long count = arr.stream().filter(s -> Integer.parseInt(s) > 20).count();
		System.out.println(count);
	}

}
