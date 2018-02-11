/*
	Конструктор с параметрами
*/

class MyClass{
	int x;
	
	MyClass(int i){
		x = i;
	}
}
class ParamConsDemo{
	
	public static void main(String args[]) {
		
		MyClass t1 = new MyClass(10);
		MyClass t2 = new MyClass(58);
		
		System.out.print(t1.x + " " + t2.x);
	}
}
	