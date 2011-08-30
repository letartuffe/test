package oop;

public class AnimalMain {
	public static void main(String[] args) {

		/*
		//Animal Ŭ���� ���� ���� a ����&���� ����
		
		Animal a = new Animal();
		
		//Animal�� �̸��� "������",
		//���̴� 20��� �����.
		
		//a.name = "������";   > private ������ ����� �� ����.
		a.age = 20 ;
		*/
		
		// ��ü = �������� = �ν��Ͻ� �����
		Animal a = new Animal();
		
		System.out.println(a.name);
		
		//��ü�� ���� ���ʿ䰡 ���� �׳� a.name���� ȣ���Ͽ� ������ �� ����.
		addInfo(a);
		System.out.println(a.name);
	}
	
	//��ü �ޱ�.. int interest ó�� �׳� Animal a �� ������ ��.
	static void addInfo(Animal a){
		a.name = "lion";
	}
	

}

class Animal{
	
	//String name ;
	//private String name;  //<--- private ���������� - Anmimal��ü ���ο����� ��밡��
	String name = "Tiger";
	int age = 20;
}