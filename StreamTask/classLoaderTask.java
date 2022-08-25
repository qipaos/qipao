package StreamTask;

public class classLoaderTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassLoader c =ClassLoader.getSystemClassLoader();
		System.out.println(c);//AppClassLoader
		
		ClassLoader c1 = c.getParent();
		System.out.println(c1);//PlatformClassLoader
		
		ClassLoader c2 = c1.getParent();
		System.out.println(c2);//null

	}

}
