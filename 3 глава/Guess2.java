/*
	Чтение символов с клавиатуры
*/

class Guess2{
	public static void main(String args[])
		throws java.io.IOException{
			char ch, answer = 'S';
			System.out.println("Задумайте букву от A до Z");
			System.out.print("Попытайтесь её угадасть: ");
			ch = (char) System.in.read();//Полусить символ с клавиатуры
			
			if(ch == answer) System.out.print("*** Правильно ***");
			else System.out.print("*** Не Правильно ***");
		}
	}
	