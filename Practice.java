
public class Practice {
	public static void main(String[] args) {
		//2중for문 쓴다면
//		int s2 = 0;
//		for(int i = 1; i <=100; i++) {
//			int s1 = 0;
//			for(int j = 1; j<=i;j++) {
//				s1 += j;
//			}
//			s2 += s1;
//		}
				
		//이중for문 안쓰고 메소드 만들어서
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum += add(i);
		}
		System.out.print("sum = " + sum);
	}
	
	static int add(int a) {
		int sum = 0;
		for(int i =1; i<=a; i++) {
			sum += i;
		}
		return sum;
		}
	}