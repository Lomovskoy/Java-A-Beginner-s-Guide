/*
	������������ �������� ����� ���� ������ � Java.
	��� ���������� �������� ���� Example2.java.
*/

class Example3 {
	public static void main(String args[]){
		int var;//����������� 1� ����������
		double x;//����������� 2� ����������
		
		var = 10;//1� ���������� ���������� ��������
		x = 10.0;
		
		System.out.println("��������� �������� ���������� var: " + var);
		System.out.println("��������� �������� ���������� x: " + x);
		System.out.println();//������ �����
		
		//��������� �������� ����� ����������
		var = var / 4;
		x = x / 4;
		
		System.out.println("�������� ���������� var ����� �������: " + var);
		System.out.println("�������� ���������� x ����� �������: " + x);
	}
}