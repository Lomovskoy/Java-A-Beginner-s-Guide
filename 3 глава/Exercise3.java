/*
	упражнение 3 глава 3
	ПРограмма которая получает символы, с клавиатуры,
	до тех пор пока не встретится точка.
	Преобразует буквы нижнего регистра в верхэний и наоборот.
	поститать количество преобразований вконце.
*/

class Exercise3{
	public static void main(String args[]) throws java.io.IOException{
		int CONST = 32;
		int change = 0;
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
			else if(choice >= 65 & choice <= 90){
				choice += CONST;
				change += 1;
			}
			else if(choice >= 97 & choice <= 122){
				choice -= CONST;
				change += 1;
			}
			System.out.println(choice);
		}
		System.out.println("Вы преобразовали " + change + " букв");
	}
}
//65 = A
//90 = Z
//97 = a
//122 = z