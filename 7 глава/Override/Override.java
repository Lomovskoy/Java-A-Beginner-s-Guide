/*
	��������������� ������
*/
	
class A{
	int i, j;
	
	A(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	//���������� ���������� i � j
	void show(){
		System.out.println("i � j: " + i + " " + j);
	}
}
	
class B extends A{
	int k;
	
	B(int a, int b, int c){
		super(a, b);
		k = c;
	}
	
	//����������� ���������� k
	void show(){
		System.out.println("k: " + k);
	}
}
	
class Override{
	
	public static void main(String args[]) {

		B subOb = new B(1, 2, 3);
		//����� ������ �� ������ B
		subOb.show();
	}
}