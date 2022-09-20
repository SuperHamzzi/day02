package variableExam;

import java.util.Scanner;

public class ScannerExam02 {
	public static void main(String[] args) {
		int score = 0;
		String result = "";
		//#1. 키보드로 부터 입력받겠다.
		Scanner sc = new Scanner(System.in);
		//#2 안내 문구
		System.out.println("점수를 입력 하세요>>");
		
		//#3. 입력 받은 점수 가져오기
		score = sc.nextInt();
		result = score >= 60 ? "합격" : "불합격";
		
		//#4. 결과출력
		System.out.println("입력받은 점수:"+score);
		System.out.println("합격여부:"+result);
	}

}
