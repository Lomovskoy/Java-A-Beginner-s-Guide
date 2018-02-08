/*
	Чтение символов с клавиатуры
*/

class KbIn{
	public static void main(String args[])
		throws java.io.IOException{
			char ch;
			System.out.print("Нажмите на клавишу а затем на Enter: ");
			ch = (char) System.in.read();//Полксить вимвол
			System.out.print("Вы нажали клавишу: " + ch);
			
		}
	}
	