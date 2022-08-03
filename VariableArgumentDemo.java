
public class VariableArgumentDemo {
	public static void main(String[] args) {
		//int a = 5;	//argument
		mymethod(7, "Hello,World", 'A', 89.5, false);		//내가 몇개 보낼지 모르니까 -> 가변적인 argument : 보내는게 가변적
	}
	static void mymethod(Object ... array) {	//parameter
//		for(int i  = 0; i<array.length; i++) {
//			System.out.println(array[i]);
//		}
		for(Object temp:array) {		//강화된 for문 사용해서 인덱싱 안하고 처음부터 끝까지 출력
			//Object 는 타입과 개수가 정해지지 않았을때 사용
			//Object는 모든 객체의 조상
			System.out.println(temp);
		}
	}
}
