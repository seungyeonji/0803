
public class RecursiveMethodDemo {	//Recursive Method 재귀호출
	public static void main(String[] args) {
		mymethod(10);
	}
	static void mymethod(int max) {
		System.out.print(max + "\t");
		if(max <=0) return;		//max가 0보다 작으면 복귀
		else mymethod(--max);
		//mymethod();	//자기자신을 호출 -> 무한루프 -> stack overflow 오류(복귀주소가 계속 stack에 쌓임)
		//-> 반환점이 있어야함 -> 조건문 활용
		
	}
}
