package MethodTest;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w=100;
		int h=50;
		System.out.print("사각형의 넓이는:"+getArea(w,h));
	}//end of main
	public static int getArea(int height, int base) {
		return(height*base);
	}
}
