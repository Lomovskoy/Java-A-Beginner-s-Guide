/*
	������������ ����������� ������ �������������
*/
	
//������� ����������
class A{
	A(){
		System.out.println("����������� ����� ������ A");
	}
}

//������� ����� ����������� ����� �
class B extends A{
	B(){
		System.out.println("����������� B - ��������� ������, �� A");
	}
}

//������� ����� ����������� ����� B
class C extends B{
	C(){
		System.out.println("����������� C - ��������� ������, B");
	}
}

class OrderOfConstruction{
	
	public static void main(String args[]) {

		C c = new C();
		
	}
}