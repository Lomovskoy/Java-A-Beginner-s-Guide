/*
	Использование массива аргументов переменной 
	длинны на ряду с обычными аргументами
*/
	

class VarArgs2{
	
	//Здесь msg - обычный аргумент 
	//а v - массив переметров переменной длинны
	static void vaTest(String msg, int ... v){
		System.out.println(msg + v.length);
		System.out.println("Содержимое: ");
		
		for(int i=0; i < v.length; i++)
			System.out.println("arg " + i + ": " + v[i]);
		
		System.out.println();
	}
	
	public static void main(String args[]) {
		
		//Метод vaTest может вызываться с переменным числом аргументов
		vaTest("Один аргумент в массиве: ", 10);
		vaTest("Три аргумента в массиве: ", 1, 2, 3);
		vaTest("Отсутствуют аргументы в массиве: ");
	}
}