package variableExam;

import java.util.Scanner;

public class OperatorExam04 {
	
	public static void main(String[] args) {
//		예제3) num = 3
//		숫자 하나를 입력받아 입력한 숫자가 3이면 "같은 수", 그렇지 않으면 "다른 수"
//		int num =3, su = 0;
//		String result = "";
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요>>");
//		
//		su = sc.nextInt();
//		result= (num==su)? "같은수":"다른 수";
//		System.out.println("결과:"+result);
		
//		예제4) name =" 홍길동"
//		이름을 입력 받아서 "홍길동" 같으면 같은 사람, 다르면 다른사람
//		//#1. 변수 선언
		String name= "홍길동", inputName="", nameResult="";
		//#2. 입력 받을 준비ㅣ
		Scanner sc = new Scanner(System.in);
		//#3. 안내문구
		System.out.println("이름을 입력하세요:");
		//#4. 사용자가 입력한 것을 가져오기
		inputName = sc.next();
		//#5. 판단
		nameResult = (name.equals(inputName)) ? "갈 사람": "다른 사람";
		//#6. 결과 출력
		System.out.println("결과 :" + nameResult);
		
		
	}

}
