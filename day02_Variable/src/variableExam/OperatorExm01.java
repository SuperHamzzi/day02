package variableExam;
/* 예제1 
 * 
 * 
 * 예제3) 번호가 짝수이면 "한강", 홀수이면 "서울숲"으로 나들이 가기? 번호는 임의로 설정 
 * 예제4) 돈이 53483원이 있다. 이것을 500, 100, 50, 10원 동전으로 교환. 각 동전의 개수와 남은돈은 얼마?
 * 
 * 
 */
public class OperatorExm01 {

	public static void main(String[] args) {
		
		int cola = 3231, st = 578,divid =5;
		int a = cola-(st*divid);
		System.out.println(a);
		System.out.println(cola%2==0 ? "한강" : "서울숲");
		
		int apple = 325, boxNumber = 13;
		int box =apple/boxNumber;
		int divideApple = apple%boxNumber;
		System.out.println(box);
		System.out.println(divideApple);
		
		int money =58483,fiveHundredWon= 500,oneHundredWon= 100,fifty= 50,ten= 10;
		int fiveHdNb=money/fiveHundredWon;
		int oneHdNb=(money%fiveHundredWon)/oneHundredWon;
		int fiftyNb=(money%oneHundredWon)/fifty;
		int tenNb=(money%fifty)/ten;
		System.out.println("500동전의 개수:" +fiveHdNb +"남은돈:"+(money-fiveHundredWon*fiveHdNb));
		System.out.println("100동전의 개수:" +oneHdNb);
		System.out.println("50동전의 개수:" +fiftyNb);
		System.out.println("10동전의 개수:" +tenNb);
		
		int nb = 3253;
		int ten1 = 100; 
		int one = 10;
		int removeTenPlace =nb-(nb%ten1);
		int removeOnePlace=nb-(nb%one);
		System.out.println("10의 자리 제거한 수:"+removeTenPlace);
		System.out.println("일의 자리 제거한 수:"+removeOnePlace);
		
		
		
		
		
		

	}

}
