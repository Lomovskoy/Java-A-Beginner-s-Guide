/*
	Этот код не пройдёт компиляцию
*/
class X{
	int a;
	X(int i){a = i;}
}
class Y{
	int a;
	Y(int i){a = i;}
}

class IncompatibleRef{
	
	public static void main(String args[]) {
		
		X x = new X(10);
		X x2;
		Y y = new Y(10);
		
		x2 = x;//Допустимо, переменные одного типа
		x2 = y;//Ошибка, типы переменных не совпадают
	}
}