/*
	Демонстрация приминения оператора if
	
	Присвойте файлу с исходным колом имя IfDemo.java
*/
class IfDemo{
	public static void main(String args[]){
		int a, b, c;
		a = 2;
		b = 3;
		
		if(a < b) System.out.println("а меньше в");
		//Следующая строчка не будет выведена
		if(a == b) System.out.println("Вы не доджныувидеть этот текст");
		System.out.println();
		
		c = a - b; //Переменная с теперь содержит значение 1
		
		System.out.println("c содержит 1");
		if(c >= 0) System.out.println("c - не отрицательное число");
		if(c < 0) System.out.println("c - отрицательное число");
	}
}