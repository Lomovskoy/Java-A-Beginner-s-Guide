/*
	Применение оператора break для выхода из цыкла
*/

class BreakDemo{
	public static void main(String args[]){
		
		int num = 100;
		
		//Выполнять цикл то тех пор, пока квадрат значения
		//переменной i меньше значенифя переменной num
		for(int i = 0; i < num; i++){
			if(i*i >= num) break;//Прекратить цикл
				System.out.print(i + " ");
			
		}
		
		System.out.print("Цикл завершён");
	}
}
	