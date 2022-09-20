package variableExam;

import java.util.Scanner;

public class OpeatorExm00 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		score >= 60 ? "합격" : "불합격";
System.out.println(score);
	}
}
