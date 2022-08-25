package StreamTask;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("zhangsan");
		arr.add("zhangtiandong");
		arr.add("zhangkaiyuan");
		arr.add("qipaoshui");
		arr.add("tianxiaoqi");
//		arr.stream().filter(s -> s.split(" , ")[0].length() > 2).forEach(System.out::println);
//		Stream<String> s1=arr.stream().limit(2);
//		
//		Stream<String> s2 = arr.stream().skip(3).limit(2);
//		Stream.concat(s1, s2).forEach(System.out::println);
//		
//		System.out.println("--------");
//		Stream.concat(s1, s2).distinct().forEach(System.out::println);
		
//		arr.stream().sorted().forEach(System.out::println);
//		arr.stream().sorted( (s1 , s2) -> s1.length() - s2.length()).forEach(System.out::println);
		
		arr.stream().sorted((s1 , s2) -> {
			int num = s1.length() - s2.length();
			int num2 = num == 0?s1.compareTo(s2):num;
			return num2;
		}).forEach(System.out::println);
	}

}
