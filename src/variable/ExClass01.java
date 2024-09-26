package variable;

public class ExClass01 {

	public static void main(String[] args) {
		
		int age = 30;
		// age 에 30이라는 정수를 저장한다
		// 정수를 저장하기 위해서는 short int long중 하나를 쓴다.
		
		double weight = 55.0, height = 170.0;
		//double에는 실수값을 저장할 수 있다.
		//콤마로 구분하여 weight와 height값을 구분하여 저장가능하다
				
		System.out.println("나의 나이는 "+ age+"살");
		System.out.println("나의 키는 "+ height+"cm");
		System.out.println("나의 몸무게는 " + weight+"kg");
		
		//hard cording : 나이를 직접 30살 이렇게입력하는 것
		// 하드 코딩은 되도록이면 하지말라고 하심.-> 변수를 사용하라고!
		
		System.out.println("-----------------");
		
		int number = 123; // 초기화 : 값을 처음 설정하는 것
		//변수를 만들 때만 자료형(int등)을 쓰고, 그 다음부터는 변수이름만 쓴다
		System.out.println("변경 전 num: " + number);
		number = 100; // 그 다음부터는 변수이름만 쓴다
		//변수는 언제든지 변경이 가능하다. number는 100으로 변경되어 100이 출력된다.
		//코드는 위에서부터 순차적으로 실행된다
		System.out.println("변경 후 num: " + number);
		
		number = number + 200;
		System.out.println("변경 후 num: " + number);
		
		
		
	}

}
