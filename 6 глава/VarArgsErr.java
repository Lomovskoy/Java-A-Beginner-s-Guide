/*
	Перегрузка методов с переменным числом аргументов
	и неопределённость в выборе перегруженной версии.
	В этолй программе имеется ошибка, и
	поэтому она не будет компилироваться.
*/
	
class VarArgsErr{
	
	//Использвание списка аргументов переменной длинный типа int
	static void vaTest(int ... v){
		//...
	}
	
	//Использвание списка аргументов переменной длинный типа boolean
	static void vaTest(boolean ... v){
		//...
	}
	
	static void vaTest(String msg, int ... v){
		System.out.println("vaTest(String msg, int ... v): " 
			+ msg + v.length);
		System.out.println("Содержимое: ");
		
		for(int i=0; i < v.length; i++)
			System.out.println("arg " + i + ": " + v[i]);
		
		System.out.println();
	}
	
	public static void main(String args[]) {
		
		vaTest(1, 2, 3);			//OK
		vaTest(true, false, false);	//OK
		vaTest();					//Err
	}
}