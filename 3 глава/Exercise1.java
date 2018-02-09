/*
	упражнение 1 глава 3
	ПРограмма которая получает символы, с клавиатуры,
	до тех пор пока не встретится точка.
	поститать количество пробелов вконце.
*/

class Exercise1{
	public static void main(String args[]) throws java.io.IOException{
		
		int space = 0;
		char choice, ignore;
		while(true){
			System.out.print("Введите любой символ и нажмите Enter ");
			System.out.println("- символ . завершит программу");
			choice = (char) System.in.read();
			System.out.println();
			do{
				ignore = (char) System.in.read();
			} while(ignore != '\n');
			if(choice == '.') break;
			else if(choice == ' ') space += 1;
		}
		System.out.println("Вы ввели " + space + " пробелов");
	}
}
	