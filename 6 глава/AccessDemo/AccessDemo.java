/*
	—равнение видов доступа public и private
*/
class MyClass {
	
	private int alpha; // закрытый доступ
	public int beta; // открытый доступ
	int gamma; // тип доступа по умолчанию (по сути, public)

	//ћетоды доступа к переменной alpha. „лены класса могут
	//обращатьс€ к закрытым членам того же класса.
	void setAlpha(int а) {
		alpha = а;
	}
	
	int getAlpha () {
		return alpha;
	}
}

class AccessDemo{
		
	public static void main(String args[]) {
		MyClass ob = new MyClass();
		
		//ƒоступ к переменной alpha возможен только с помощью
		//специально предназначенных дл€ этой цели методов.
		ob.setAlpha(-99);
		System.out.println("ob.alpha: " + ob.getAlpha());
		
		// ќбратитьс€ к переменной alpha так, как показано ниже, нельз€
		// ob.alpha = 10; // ќшибка: alpha - закрыта€ переменна€!
		
		// —ледующие обращени€ вполне допустимы, так как
		// переменные beta и gamma €вл€ютс€ открытыми
		ob.beta = 88; // ¬озможно, поскольку это открытые переменные
		ob.gamma = 99;
			
	}
}