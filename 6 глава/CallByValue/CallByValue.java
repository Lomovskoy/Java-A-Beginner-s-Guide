/*
	Простые тиnы данных передаются методам по значению
*/

//Этот метод не может изменить значения аргументов,
//передаваемых ему при вызове.
class Test {
	void noChange(int i, int j) {
		i += j;
		j = -j;
	}
}
class CallByValue{
	
	public static void main(String args[]) {
		
		Test ob = new Test();
		int a = 15, b = 20;
		
		System.out.println("a и b перед вызовом: " +
			a + " " + b);
		ob.noChange(a, b);
		System.out.println("a и b после вызова: " +
			a + " " + b);
	}
}
