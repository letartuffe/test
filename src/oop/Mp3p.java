//Ŭ������ Mp3p
//�Ӽ� : ������ ����ϴ� color
//		�޸� �뷮�� ����ϴ� memory
//
//���� : memory �뷮�� ���׷��̵����ִ� memoryUp
//		color�� �����ϴ� setColor

package oop;

public class Mp3p {
	
	private String color;	//�ν��Ͻ� ����
	int memory;		//�ν��Ͻ� ����
	//static ������ ��ü�� ������ �����Ǹ�, �� �ϳ��� ����
	//��ΰ� �����ϴ� ����. 
	//��ü�� �������� �ʾƵ� ��밡��.
	//Ư�� ��ü���� ���� �����ϸ� �ٸ� ��ü���� ������ ���� ���
	
	static String maker;	//����ƽ ����
	
	
	public void memoryUp(int n){
		memory +=n ;
		System.out.println("�޸� �뷮 �����׷��̵� �Ϥ�");
	}
	
	public void setColor(String c){
		color = c;
		System.out.println("���󺯰�");
				
	}	
}
