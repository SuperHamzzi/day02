package variableExam;

public class CastringExam01 {
	public static void main(String[] args) {
//		byte a = 3, b=2;
//		int c= 10, d= 5;
//		double r = 0.0;
//		r = c / d;
//		System.out.println(a+b);
//		System.out.println(r);
		
		int a = 13, b= 3, score=70;
		double d=0.0, e=123.783469;
		String name = "홍길동";
		char grade = 'A';
		d = a/b;
		System.out.println("a/b :"+(a/b));
		System.out.println("a/b :"+(d));
		
		System.out.printf("이름 : %s, 성적 : %d, 학점 : %c, e : %.2f",name,score,grade,e);
		
		
	}

}
