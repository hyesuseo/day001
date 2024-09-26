package input;

import java.util.Scanner; //이게 추가되어야 에러가 발생하지 않음
//import: 가지고 오겠다는 의미임
//JRE시스템 라이브러리에서 필요한 최소한의 프로그램만 가져오는 것!

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // [암기]입력받는 자료형임
		//첫번째 글자가 대문자인 것은 class라는 뜻 : Scanner가 클래스
		System.out.print("숫자입력: " );
		int num; 
		num = scan.nextInt(); //입력받는 기능
		System.out.println("입력 값: " + num);
		
		double dou; //실수값
		System.out.print("실수입력: ");
		dou = scan.nextDouble();
		System.out.println("입력한 실수값: "+ dou);
		
		String str;
		System.out.print("문자열입력: ");
		str = scan.next(); //문자열은 그냥 next만 씀
		System.out.println("입력한 문자열: " + str);

	}

}
