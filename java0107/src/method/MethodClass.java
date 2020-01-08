package method;

public class MethodClass {
	// 매개변수가 없고 리턴 타입이 void 메소드
	public void disp() {
		// 메소드의 내용
		for (int i = 0; i < 3; i = i + 1) {
			System.out.println("Hello Java");
		}
	}

	// 매개변수가 정수 1개이고 리턴 타입이 void 메소드
	// 이 메소드는 호출할려면 반드시 정수 1개를 넘겨주어야 합니다.
	// 동일한 이름의 메소드가 하나의 클래스에 존재하는 경우를 Method Overloading 이라고 합니다.
	public void disp(int n) {
		// 메소드의 내용
		for (int i = 0; i < n; i = i + 1) {
			System.out.println("Hello Java");
		}
	}
	
	//정수 1개를 매개변수로 받아서 1증가시키고 출력하는 메소드 : Call By Value
	public void inc(int n) {
		n = n + 1;
		System.out.println("n:" + n); 
	}
	
	//배열 1개를 매개변수로 받아서 첫번째 데이터를 1감소시키고 출력하는 메소드 : Call By Reference
	public void dec(int [] ar) {
		ar[0] = ar[0] - 1;
		System.out.println("ar[0]:" + ar[0]);
	}
	
	
	//정수 데이터가 몇 개 가 오던지 합계를 구해서 출력해주는 메소드
	public void sum(int ... ar) {
		//... 이름을 이용하면 내부에서는 배열로 취급
		int sum = 0;
		//배열의 모든 데이터를 순서대로 접근해서 sum에 추가
		for(int data : ar) {
			sum = sum + data;
		}
		System.out.println("합계:" + sum);
	}


	//2개의 정수를 매개변수로 받아서 더한 후 결과를 출력하는 메소드
	public void addDisplay(int a, int b) {
		System.out.println("a+b:" + (a+b));
	}
	
	//2개의 정수를 매개변수로 받아서 더한 후 결과를 리턴하는 메소드
	//메소드 이름 앞의 자료형과 return 하는 데이터의 자료형은 일치해야 합니다.
	public int addReturn(int a, int b) {
		return (a+b);
	}
}

















