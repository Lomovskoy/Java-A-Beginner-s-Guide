/*
	�������������� �������������� ����� ����� ������
	�� ����� �������������� ������.
*/

class Overload2 {
	
	void f(byte �) {
		System.out.println("B�y�p� f(byte): " + �);
	}
	
	void f (int �) {
		System.out.println("B�y�p� f(int): " + �);
	}
	
	void f(double �) {
		System.out.println("B�y�p� f(double): " + �);
	}
}

class TypeConv{
	
	public static void main(String args[]) {
		
		Overload2 ob = new Overload2();
		int i = 10;
		double d = 10.1;
		byte b = 99;
		short s = 10;
		float f = 11.5F;
		
		ob.f(i); // ����� ������ ob.f(int)
		ob.f(d); // ����� ������ ob.f(double)
		ob.f(b); // ����� ������ ob.f(byte) ��� �������������� �����
		ob.f(s); // ����� ������ ob.f(int) � ��������������� �����
		ob.f(f); // ����� ������ ob.f(double) � ��������������� �����

	}
}
