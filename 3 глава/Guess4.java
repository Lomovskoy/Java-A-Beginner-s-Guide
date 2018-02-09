/*
	Чтение символов с клавиатуры 3 версия
*/

class Guess4{
	public static void main(String args[]) throws java.io.IOException{
			
		char ch, ignore, answer = 'S';
			
		do{
			System.out.println("Задумайте букву от A до Z");
			System.out.print("Попытайтесь её угадасть: ");
				
			//Полусить символ с клавиатуры
			ch = (char) System.in.read();
			
			//Отбросить остальные символы во входном буфере
			do{
				ignore = (char) System.in.read();
			} while(ignore != '\n');
				
			if(ch == answer) System.out.print("*** Правильно ***");
			else {
				System.out.println("*** Не Правильно ***");
				//Волженный оператор
				if(ch < answer)
					System.out.print("*** Заданный символ находится ближе к концу алфавита ***");
				else
					System.out.print("*** Заданный символ находится ближе к началу алфавита ***");
			}	
		} while(answer != ch);	
	}
}
	