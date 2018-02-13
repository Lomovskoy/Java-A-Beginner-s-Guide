/*
	Демонстрация привышения границ массива
*/
	
class ArrayErr{
		
	public static void main(String args[]) {
			
		int sample[] = new int[10];
		
		//Создаём искуственный выход за границы массива
		for(int i = 0; i < 100; i++)
			sample[i] = i;
			
	}
}