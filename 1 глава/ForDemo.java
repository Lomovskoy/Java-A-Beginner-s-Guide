/*
	Демонстрация приминения оператора if
	
	Присвойте файлу с исходным колом имя ForDemo.java
*/
class ForDemo{
	public static void main(String args[]){
		int count;
		
		for(count = 0; count < 5; count = count + 1)
			System.out.println("Значение счётчика: " + count);
		
		System.out.println("Готово!");
		System.out.println();
		
		for(count = 5; count > 0; count--)
			System.out.println("Значение счётчика: " + count);
		
		System.out.println("Готово!");
		System.out.println();
		
		for(count = 0; count < 5; count++)
			System.out.println("Значение счётчика: " + count);
		
		System.out.println("Готово!");
		System.out.println();
	}
}