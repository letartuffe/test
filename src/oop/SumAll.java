package oop;

public class SumAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumAll(10,20,30));
		System.out.println(sum(10,20,30));
	}
	//VarArgs�� �̿��Ͽ� ó��
	private static int sum(int ... n) {
		int total = 0 ;
		for (int i = 0; i < n.length ; i++){
			
			total = total + n[i];
			//total += n[i];
			
		}
		return total;
	}

	private static int sumAll(int i, int j, int k) {

		return i+j+k;
	}

}
