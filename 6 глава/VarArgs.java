/*
	Демонстрация использования мтодов 
	с переменнвм числом аргументов
*/
	

class VarArgs{
	
	//Метод vaTest допускает переменное чилсо аргуметов
	static void vaTest(int ... v){
		System.out.println("Количество аргументов: " + v.length);
		System.out.println("Содержимое: ");
		
		for(int i=0; i < v.length; i++)
			System.out.println("arg " + i + ": " + v[i]);
		
		System.out.println();
	}
	
	public static void main(String args[]) {
		
		//Метод vaTest может вызываться с переменным числом аргументов
		vaTest(10);
		vaTest(1, 2, 3);
		vaTest();
	}
}