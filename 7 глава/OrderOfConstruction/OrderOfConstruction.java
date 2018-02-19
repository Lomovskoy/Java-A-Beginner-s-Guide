/*
	Демонстрация очерёдносоти вызова конструкторов
*/
	
//Создать суперкласс
class A{
	A(){
		System.out.println("Конструктор супер класса A");
	}
}

//Создать класс расширяющий класс А
class B extends A{
	B(){
		System.out.println("Конструктор B - дочернего класса, от A");
	}
}

//Создать класс расширяющий класс B
class C extends B{
	C(){
		System.out.println("Конструктор C - дочернего класса, B");
	}
}

class OrderOfConstruction{
	
	public static void main(String args[]) {

		C c = new C();
		
	}
}