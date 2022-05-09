
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1;
		System.out.println(b);
		
		// int c = 1.1;
		double c1 = 1.1;
		int e = (int) 1.1; 
		System.out.println(e);
		
		//1 to String
		String str1 = Integer.toString(e);
		
		System.out.println(str1.getClass());
		//.getClass 어떤 데이터 타입인지 알려준다.
	}

}
