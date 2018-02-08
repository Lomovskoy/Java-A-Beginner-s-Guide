/*
	Демонстрация различий между типа данных в  Java.
	При сохранении назовите файл Example2.java.
*/

class Example3 {
	public static void main(String args[]){
		int var;//Обьявленная 1я переменная
		double x;//Обьявленная 2я переменная
		
		var = 10;//1й переменной присвоенно значение
		x = 10.0;
		
		System.out.println("Начальное значение переменной var: " + var);
		System.out.println("Начальное значение переменной x: " + x);
		System.out.println();//Пустая срока
		
		//Разделить значения обеих переменных
		var = var / 4;
		x = x / 4;
		
		System.out.println("Значение переменной var после деления: " + var);
		System.out.println("Значение переменной x после деления: " + x);
	}
}