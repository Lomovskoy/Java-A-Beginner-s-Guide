/*
	������������ ���������� �������������
*/

class MyClass {
	
	int x;
	
	MyClass(){
		System.out.println("B�y�p� MyClass().");
		x = 0;
	}
	
	MyClass (int i) {
		System.out.println("B�y�p� MyClass(int).");
		x = i;
	}
	
	MyClass(double d) {
		System.out.println("B�y�p� MyClass(double).");
		x = (int)d;
	}
	
	MyClass (int i, int j) {
		System.out.println("B�y�p� MyClass(int, int).");
		x = i * j;
	}
}
class OverloadConsDemo{
	
	public static void main(String args[]) {
		
		MyClass t1 = new MyClass();
		MyClass t2 = new MyClass(88);
		MyClass t3 = new MyClass(17.23);
		MyClass t4 = new MyClass(2, 4);
		System.out.println("tl.x: " + t1.x);
		System.out.println("t2.x: " + t2.x);
		System.out.println("t�.x: " + t3.x);
		System.out.println("t4.x: " + t4.x);
		
	}
}
