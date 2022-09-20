package Test1;

public class Test1 {
	public static void main(String[] args) {
		int width = 10;
		int height = 20;
		int area = width*height;
		int area2 = (width*height)/2;
		System.out.println("사각형의 넓이:"+ area);
		System.out.println("삼각형의 넓이:"+ area2);
		
		final double WIDTH2 = 10.4;
		final double HEIGHT2 = 20.3;
		final double area3 =  WIDTH2*HEIGHT2;
		final double area4 =  (WIDTH2*HEIGHT2)/2;
		System.out.println("사각형의 넓이:"+ area3);
		System.out.println("삼각형의 넓이:"+ area4);
		
		int a = 1;
		System.out.println(a);
		a = 2;
		System.out.println(a);
	}

}
