package variableExam;

import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num = 0;// 초기화
		String result="";// 문자열을 초기화
		System.out.println("숫자를 입력하세요>>");
		num = sc.nextInt();
		
		result = (num % 2 ==0) ? "한강" : "서울숲";
		System.out.println("입력값은: "+num);
		System.out.println("나들이 장소 :"+ result);
		
	}

}
