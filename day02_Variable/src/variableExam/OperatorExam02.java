package variableExam;

import java.util.Scanner;

public class OperatorExam02 {
	public static void main(String[] args) {
//		
//		  int a=3, b=2, c=5;
//		 
//		  c= a++ + b--; System.out.println("a :" +a+ "  b:" +b+"  c:" +c);
//		
  
//		int a=3, b=2, c=5;
//		c= a++ + --b;
//		System.out.println("a :" +a+ "  b:" +b+"  c:" +c);
		
		
		//논리 연산자
//		boolean result = false;
//		boolean result = (10>3) && (4>=5);
//		int kor = 50, eng= 70, mat = 80;
//		result = (kor>=60) && (eng>=60);
//		System.out.println(result);
//		System.out.println();
//		result = (kor>=60) && (eng>=60) && (mat>=60);
//		System.out.println(result);
//		System.out.println();
//		
//		result = (kor>=60) || (eng>=60) || (mat>=60);
//		System.out.println(result);
//		System.out.println();
		
// 예제1) 
		
		int num1, num2 = 0;
		String result = "";
	Scanner sc = new Scanner(System.in);
		System.out.printf("점수 2개를 입력하시오");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		result = (num1>=60)&&(num2>=60)? "합격" : "불합격";
		System.out.println(result);
		
		int num3, num4 = 0;
		System.out.println("숫자 2개를 입력 하시오:");
		num3=sc.nextInt();
		num4=sc.nextInt();
		result = num3>num4 ? "큰 수:"+num3 +"작은 수:"+num4 : "큰 수:"+num4+"작은 수:"+num3;
		System.out.println(result);
		
		System.out.printf("숫자 1개를 입력하시오:");
		int num5 = sc.nextInt();
		result = num5==3? "같은수" :"다른 수";
		System.out.println(result);
		
		
		System.out.printf("이름을 입력하시오: ");
		String name =sc.next();
		result = (name.equals("홍길동")) ? "같은사람" :"다른 사람";
		System.out.println(result);
		
		
		
		
		
		
	}

}
