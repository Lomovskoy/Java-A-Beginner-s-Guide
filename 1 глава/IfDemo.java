/*
	������������ ���������� ��������� if
	
	��������� ����� � �������� ����� ��� IfDemo.java
*/
class IfDemo{
	public static void main(String args[]){
		int a, b, c;
		a = 2;
		b = 3;
		
		if(a < b) System.out.println("� ������ �");
		//��������� ������� �� ����� ��������
		if(a == b) System.out.println("�� �� ������������� ���� �����");
		System.out.println();
		
		c = a - b; //���������� � ������ �������� �������� 1
		
		System.out.println("c �������� 1");
		if(c >= 0) System.out.println("c - �� ������������� �����");
		if(c < 0) System.out.println("c - ������������� �����");
	}
}