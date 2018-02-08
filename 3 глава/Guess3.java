/*
	Чтение символов с клавиатуры 3 версия
*/

class Guess3{
	public static void main(String args[])
		throws java.io.IOException{
			char ch, answer = 'S';
			System.out.println("Задумайте букву от A до Z");
			System.out.print("Попытайтесь её угадасть: ");
			ch = (char) System.in.read();//Полусить символ с клавиатуры
			
			if(ch == answer) System.out.print("*** Правильно ***");
			else {
				System.out.println("*** Не Правильно ***");
				//Волженный оператор
				if(ch < answer)
					System.out.print("*** Заданный символ находится ближе к концу алфавита ***");
				else
					System.out.print("*** Заданный символ находится ближе к началу алфавита ***");
			}
		}
	}
	