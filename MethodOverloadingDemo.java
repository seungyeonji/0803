//중복정의
/*
 * method Overloading : 메소드의 이름이 같을 때 그 메소드의 파라미터로 구별하는 기능
 * 1) 메소드의 이름이 같아야 한다
 * 2) 반드시 메소드의 파라미터는 서로 달라야 한다
 * 3) 메소드의 리턴타입은 같거나 다르거나 상관없다 * 
 */

public class MethodOverloadingDemo {
	public static void main(String[] args) {
		System.out.println(add(34.5, 67.8));	//이름 같아도 parameter가 double이기 때문에
		System.out.println(add(4,5,6));
		System.out.println(add(4,5));
	}
	
	static int add(int a, int b) {
		return a + b;
	}
	static int add(int a, int b, int c) {
		return a + b + c;
	}
	static double add(double a, double b) {
		return a + b;
	}
	//더하기 라는 메커니즘은 똑같은데 여러개 만들어야 할까?
	//-> 같은이름 써도됨 : overloading(중복정의), *단 파라미터는 달라야함
	//만약 이름이 같으면 파라미터로 구분하기 때문에
	
}
