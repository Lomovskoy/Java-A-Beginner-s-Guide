/*
	Обращение к обьекту подкласса по 
	ссылочной переменной подкласса
*/
class X{
	int a;
	X(int i){a = i;}
}
class Y extends X{
	int b;
	
	Y(int i, int j){
		super(j);
		b = i;
	}
}

class SupSubRef{
	
	public static void main(String args[]) {
		
		X x = new X(10);
		X x2;
		Y y = new Y(5, 6);
		
		x2 = x;//Допустимо, переменные одного типа
		System.out.println("x2.a: " + x2.a);
		
		//Допустимо така как y наследуется от x и имеет доступ
		//ко всем его членам
		x2 = y;
		
		//В классе Х известны болько члены класса Х
		x2.a = 19;
		// x2.b = 27; // ошибка
	}
}