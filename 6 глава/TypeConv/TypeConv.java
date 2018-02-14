/*
	Автоматическое преобразование типов может влиять
	на выбор перегружаемого метода.
*/

class Overload2 {
	
	void f(byte х) {
		System.out.println("Bнyтpи f(byte): " + х);
	}
	
	void f (int х) {
		System.out.println("Bнyтpи f(int): " + х);
	}
	
	void f(double х) {
		System.out.println("Bнyтpи f(double): " + х);
	}
}

class TypeConv{
	
	public static void main(String args[]) {
		
		Overload2 ob = new Overload2();
		int i = 10;
		double d = 10.1;
		byte b = 99;
		short s = 10;
		float f = 11.5F;
		
		ob.f(i); // вызов метода ob.f(int)
		ob.f(d); // ВЫЗОВ метода ob.f(double)
		ob.f(b); // вызов метода ob.f(byte) без преобразования типов
		ob.f(s); // ВЫЗОВ метода ob.f(int) с преобразованием типов
		ob.f(f); // вызов метода ob.f(double) с преобразованием типов

	}
}
