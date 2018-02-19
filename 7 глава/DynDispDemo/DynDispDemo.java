/*
	Демонстрация динамической диспетчеризации методов
*/
class Sup{
	void who(){
		System.out.println("who в Sup");
	}
}

class Sup1 extends Sup{
	void who(){
		System.out.println("who в Sup1");
	}
}

class Sup2 extends Sup{
	void who(){
		System.out.println("who в Sup2");
	}
}

	
class DynDispDemo{
	
	public static void main(String args[]) {

		Sup superOb = new Sup();
		Sup1 subOb1 = new Sup1();
		Sup2 subOb2 = new Sup2();
		
		/*
			В каждом из этих вызовов выцбор версии метода who()
			осуществляется по типу обьекта, на который указывает 
			ссылка во время выполнения
			ссылка во время выполнения
		*/
		
		Sup supRef;
		
		supRef = superOb;
		supRef.who();
		
		supRef = subOb1;
		supRef.who();
		
		supRef = subOb2;
		supRef.who();
	}
}