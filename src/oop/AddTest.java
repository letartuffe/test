package oop;

public class AddTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add(100, 200);
		
		int eeja = interest(10000);
		System.out.println("���ڴ� " + eeja);
		
	}
	
	public static int interest(int won){
		
		int  interest_rate ;
		return interest_rate = (int) (won * 0.15);
	}
	
	public static void add(int a, int b){
		int c = a + b ;
		System.out.println("��������� "+c+"�Դϴ�.   ");
	}

}
