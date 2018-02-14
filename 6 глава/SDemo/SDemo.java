/*
	Применение статической переменной
*/	

class StaticDemo {
	int х; // обычная переменная экземпляра
	static int y; // статическая переменная

	// Возвратить сумму значений переменной экземпляра х и
	// статической переменной y
	int sum() {
		return х + y;
	}
}

class SDemo{
		
	public static void main(String args[]) {
		
		StaticDemo ob1 = new StaticDemo();
		StaticDemo ob2 = new StaticDemo();

		// У каждого объекта имеется своя копия
		// переменной экземпляра
		ob1.х = 10;
		ob2.х = 20;
		
		System.out.println("Paзyмeeтcя, оb1.х и оb1.х " + "независимы");
		System.out.println("ob1.x: " + ob1.х + "\nob2.x: " + ob2.х);
		System.out.println();
		
		// Все объекты совместно используют одну общую
		// копию статической переменной
		System.out.println("Cтaтичecкaя переменная у - общая");
		StaticDemo.y = 19;
		System.out.println("Пpиcвoить StaticDemo.y значение 19");
		System.out.println("ob1.sum(): " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());
		System.out.println();
		StaticDemo.y = 100;
		System.out.println("Измeнить значение StaticDemo.y на 100");
		System.out.println("ob1.sum(): " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());
		System.out.println(); 
	}
}