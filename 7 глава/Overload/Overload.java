/*
	Методы с разными сигнатурами не 
	переопределяются, а перегружаются
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
	
	//Перегрузить метод show()
	void show(String mag){
		System.out.println("k: " + k);
	}
}
	
class Overload{
	
	public static void main(String args[]) {

		B subOb = new B(1, 2, 3);
		//Вызов метода из класса B
		subOb.show("k: ");
		subOb.show();
	}
}