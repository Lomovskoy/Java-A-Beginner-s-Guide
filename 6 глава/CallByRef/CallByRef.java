/*
	������� ���������� ������� no ������
*/

//���� ����� �� ����� �������� �������� ����������,
//������������ ��� ��� ������.
class Test {
	int �, b;
	
	Test (int i, int j) {
		� = i;
		b = j;
	}
	
	/* �������� ������� ������. ������ ���������� �b.� � �b.b
	�������, ������������� ��� ������, ����� ����� ����������. */
	void change(Test ob) {
		ob.� += ob.�;
		ob.b = -ob.b;
	}
	
}
class CallByRef{
	
	public static void main(String args[]) {
		
		Test ob = new Test(15, 20);
		
		System.out.println("ob.a � �b.b ����� �������: " +
			ob.� + " " + ob.b);
		ob.change(ob);
		System.out.println("ob.a � ��.� ����� ������: " +
			ob.� + " " + ob.b);
	}
}
