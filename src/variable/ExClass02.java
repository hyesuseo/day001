package variable;

public class ExClass02 {

	public static void main(String[] args) {
		char ch = 'A';
		//character 변수에 저장할 수 있는 데이터는 문자 하나 뿐이다. 
		//''로 묶어주어야 한다.
		//''는 문자 하나를 저장할 때 사용함
		//""는 문자열을 저장할 때 사용함
		
		String str = "안녕하세요";
		//String은 문자열을 저장할 수 있는 변수
		//그래서 스트링은 무조건 ""로 묵어주어야 한다.
		
		System.out.println(ch);
		System.out.println(str);
		
		ch = '안';
		str = "반갑습니다";
		System.out.println(ch);
		System.out.println(str);
		
		//상수
		System.out.println("---상수---");
		final String KOREA = "대한민국"; //처음에는 대한민국이 들어가서 대한민국이 출력됨
		System.out.println(KOREA);
		/*
		korea = "미국"; 그 다음엔 미국이 들어가서 미국이 출력됨
		System.out.println(korea);
		//대명사는 변수로 사용하긴 하지만 변경이 안되도록 막아주어야한다: 상수화: final
		//final은 팀플젝시 공통적으로 사용하는 경로를 고정하기 위해 사용된다.
		*/
		
		System.out.println("----형변환(type casting)----");
		
		char ch02 = 'A'; //ch02변수는 만들어짐과 동시에 초기화가 된다.
		int ret; //대입하지 않고 선언만 하는 것, ret라는 공간은 만들어짐
		//어떤 값도 저장되어있지 않다-> 이렇게만 해놓고 출력하면 오류발생
		
		System.out.println(ch02);
		System.out.println((int)ch02);
		//특정 변수 앞에 자료형을 부여하면, int 형식으로 변화된 A가 출력된다.
		//A는 아스키코드상 65여서 65로 표시됨
		//이런게 있구나 정도로 알아두면 된다.
	
	}
	

}
