/*
	���������� ����������� ����������
*/	

class StaticDemo {
	int �; // ������� ���������� ����������
	static int y; // ����������� ����������

	// ���������� ����� �������� ���������� ���������� � �
	// ����������� ���������� y
	int sum() {
		return � + y;
	}
}

class SDemo{
		
	public static void main(String args[]) {
		
		StaticDemo ob1 = new StaticDemo();
		StaticDemo ob2 = new StaticDemo();

		// � ������� ������� ������� ���� �����
		// ���������� ����������
		ob1.� = 10;
		ob2.� = 20;
		
		System.out.println("Pa�y�ee�c�, �b1.� � �b1.� " + "����������");
		System.out.println("ob1.x: " + ob1.� + "\nob2.x: " + ob2.�);
		System.out.println();
		
		// ��� ������� ��������� ���������� ���� �����
		// ����� ����������� ����������
		System.out.println("C�a���ec�a� ���������� � - �����");
		StaticDemo.y = 19;
		System.out.println("�p�c�o��� StaticDemo.y �������� 19");
		System.out.println("ob1.sum(): " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());
		System.out.println();
		StaticDemo.y = 100;
		System.out.println("���e���� �������� StaticDemo.y �� 100");
		System.out.println("ob1.sum(): " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());
		System.out.println(); 
	}
}