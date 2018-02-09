/*
	Демонстрация цикла Do-While
*/

class DwDemo{
	public static void main(String args[]) throws java.io.IOException{
		
		char ch;
		
		do{
			System.out.println("Нажмите нужную клавишу, а затем клавишу Enter");
			ch = (char)System.in.read();//Получить нужную букву с клавиатуры
		}while (ch != 'q');

	}
	
}
	