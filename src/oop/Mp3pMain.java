package oop;

public class Mp3pMain {
	public static void main(String[] args){
		
		Mp3p mp3;			//MP3p Ŭ������ ���� ��ü ����
		mp3 = new Mp3p(); 	//MP3p Ŭ������ ���� ��ü ����
		
		//�޸� �뷮�� �ø��� ȣ��
		mp3.memoryUp(1000);
		
		//mp3�� ���� �����, �뷮�� 4000, �Ｚ ����
		//�ν��Ͻ� ����
		//mp3.color = "���";  >> private ���� ���� ���Ұ�.
		
		mp3.memory = 4000 ; 
		
		//����ƽ(Ŭ����) ����
		Mp3p.maker = "�Ｚ";
		
		//setColor ���
		//mp3 ���� �ٲٴ� �޼ҵ� ȣ��
		mp3.setColor("���");
		
	}
}
