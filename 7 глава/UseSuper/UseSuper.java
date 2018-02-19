/*
	Использование ключевого слова super 
	для предотвращения сокрытия имён
*/
	
class A{
	int i;
}

//Создать подкласс расширяющий класс А
class B extends A{
	int i;//эта переменная скрывает переменную i класса А
	
	B(int a, int b){
		super.i = a;//переменная i класса А
		i = b;		//переменная i класса B
	}
	
	void show(){
		System.out.println("i в суперклассе: " + super.i);
		System.out.println("i в подклассе: " + i);
	}
}
class UseSuper{
	
	public static void main(String args[]) {
		B subOb = new B(1, 2);
		subOb.show();
		
	}
}