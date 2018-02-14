/*
	Перегрузка методов
*/
class Overload {
	
	void ovlDemo() { 
		System.out.println("Бeз параметров");
	}
	
	// Перегрузка метода ovlDemo для одного параметра типа int
	void ovlDemo(int а) {
		System. out. println ( "Один параметр: " + а);
	}
	
	// Перегрузка метода ovlDemo для двух параметров типа int
	int ovlDemo(int а, int b) {
		System.out.println("Двa параметра: " + а + " " + b);
		return а + b;
	}
	
	// Перегрузка метода ovlDemo для двух параметров типа double
	double ovlDemo(double а, double b) {
		System.out.println("Двa параметра типа double: " +
			а + " " + b);
		return а + b;
	}
	
	
	
}
class OverloadDemo{
	
	public static void main(String args[]) {
		
		Overload ob = new Overload();
		int resI;
		double resD;
		
		// Поочередно вызвать все версии метода ovlDemo()
		ob.ovlDemo();
		System.out.println();
		
		ob.ovlDemo(2);
		System.out.println();
		
		resI = ob.ovlDemo(4, 6);
		System.out.println("Peзyльтaт вызова ob.ov1Demo(4, 6): " + resI);
		System.out.println();
		
		resD = ob.ovlDemo(1.1, 2.32);
		System.out.println("Peзyльтaт вызова ob.ovlDemo(l.l, 2.32): " + resD);

	}
}
