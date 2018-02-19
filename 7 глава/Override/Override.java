/*
	Переопределение метода
*/
	
class A{
	int i, j;
	
	A(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	//Отобразить переменные i и j
	void show(){
		System.out.println("i и j: " + i + " " + j);
	}
}
	
class B extends A{
	int k;
	
	B(int a, int b, int c){
		super(a, b);
		k = c;
	}
	
	//Отображение переменной k
	void show(){
		System.out.println("k: " + k);
	}
}
	
class Override{
	
	public static void main(String args[]) {

		B subOb = new B(1, 2, 3);
		//Вызов метода из класса B
		subOb.show();
	}
}