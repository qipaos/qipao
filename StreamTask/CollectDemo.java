package StreamTask;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"林青霞 , 30" , "张曼玉 , 23"  , "王祖贤 , 43" ,"柳岩 , 25"};
		Stream<String> arrayStream = Stream.of(str).filter(s -> Integer.parseInt(s.split(" , ")[1]) > 20);
		Map<String , Integer> map = arrayStream.collect(Collectors.toMap(s -> s.split(" , ")[0], s -> Integer.parseInt(s.split(" , ")[1])));
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			Integer value =map.get(key);
			System.out.println( key+ ","+value);
		}
	}

}
