/*
	Объекты передаются методам no ссылке
*/

//Этот метод не может изменить значения аргументов,
//передаваемых ему при вызове.
class Test {
	int а, b;
	
	Test (int i, int j) {
		а = i;
		b = j;
	}
	
	/* Передача объекта методу. Теперь переменные оb.а и оb.b
	объекта, используемого при вызове, также будут изменяться. */
	void change(Test ob) {
		ob.а += ob.а;
		ob.b = -ob.b;
	}
	
}
class CallByRef{
	
	public static void main(String args[]) {
		
		Test ob = new Test(15, 20);
		
		System.out.println("ob.a и оb.b перед вызовом: " +
			ob.а + " " + ob.b);
		ob.change(ob);
		System.out.println("ob.a и оЬ.Ь после вызова: " +
			ob.а + " " + ob.b);
	}
}
