/*
	Демонстрация присваивания переменных в  Java.
	При сохранении назовите файл Example2.java.
*/

class Example2 {
	public static void main(String args[]){
		int var1;//Обьявленная 1я переменная
		int var2;//Обьявленная 2я переменная
		
		var1 = 1024;//1й переменной присвоенно значение
		
		System.out.println("Переменная var1 содержит " + var1);
		
		var2 = var1/2;
		
		System.out.print("Переменная var2 содержит var1/2: ");
		System.out.println(var2);
	}
}