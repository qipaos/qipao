package StreamTask;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ActorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> manlist = new ArrayList<String>();
		manlist.add("周杰伦");
		manlist.add("吴京");
		manlist.add("刘德华");
		manlist.add("李连杰");
		manlist.add("成龙");
		manlist.add("周星驰");
		
		ArrayList<String> womenlist = new ArrayList<String>();
		womenlist.add("林心如");
		womenlist.add("张曼玉");
		womenlist.add("林青霞");
		womenlist.add("柳岩");
		womenlist.add("林志玲");
		womenlist.add("王祖贤");
		
//		Stream<String> manStream = manlist.stream().filter(s -> s.length() == 3).limit(3);
//		Stream<String> womenStream = womenlist.stream().filter(s -> s.startsWith("林")).skip(1);
//		Stream<String> stream=Stream.concat(manStream, womenStream);
//		stream.map(Actor::new).forEach(p -> System.out.println(p.getName()));
		
		Stream.concat(manlist.stream().filter(s -> s.length() == 3).limit(3), 
				womenlist.stream().filter(s -> s.startsWith("林")).skip(1)).map(Actor::new).
		forEach(p -> System.out.println(p.getName()));
	}
	

}
