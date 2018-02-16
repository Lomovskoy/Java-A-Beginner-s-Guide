/*
	Напишите метод swap(), релизующий обмен содержимым между двумя 
	обьектами Test, на которые ссылаются две переменные данного типа.
*/
class Test{
	
	int a;
	
	Test(int a){
		this.a = a;
	}
	//Метод для получения значения из класса 
	public int swap(){
		return a;
	}
	
	//Перегружннй мтод для установки значения в классе
	public void swap(int a){
		this.a = a;
	}
}
	

class TestDemo{
		
	public static void main(String args[]) {
		
		Test test1 = new Test(4);
		Test test2 = new Test(2);
		System.out.println("Создаём 2 обьекта Тест1 и Тест2");
		System.out.println("Содержание Тест1: " + test1.a);
		System.out.println("Содержание Тест2: " + test2.a);
		System.out.println("Объект Тест2 - передаёт содержимое Тест1");
		test1.swap(test2.swap());
		System.out.println("Содержание Тест1: " + test1.a);
		System.out.println("Содержание Тест2: " + test2.a);
	}
}