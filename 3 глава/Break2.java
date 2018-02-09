/*
	Применение оператора break для выхода из цыкла
*/

class Break2{
	public static void main(String args[]) throws java.io.IOException{
		
		char ch;
		
		//Выполнять цикл то тех пор, пока квадрат значения
		//переменной i меньше значенифя переменной num
		for(;;){
			ch = (char) System.in.read();//Получить символ с клавиатуры
			if(ch == 'q') break;
		}
		System.out.print("Вы нажаликлавишу q");
	}
}
	