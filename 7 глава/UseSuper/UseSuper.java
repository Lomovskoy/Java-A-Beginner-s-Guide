/*
	������������� ��������� ����� super 
	��� �������������� �������� ���
*/
	
class A{
	int i;
}

//������� �������� ����������� ����� �
class B extends A{
	int i;//��� ���������� �������� ���������� i ������ �
	
	B(int a, int b){
		super.i = a;//���������� i ������ �
		i = b;		//���������� i ������ B
	}
	
	void show(){
		System.out.println("i � �����������: " + super.i);
		System.out.println("i � ���������: " + i);
	}
}
class UseSuper{
	
	public static void main(String args[]) {
		B subOb = new B(1, 2);
		subOb.show();
		
	}
}