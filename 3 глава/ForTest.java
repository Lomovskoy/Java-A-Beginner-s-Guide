/*
	Выполнение цикла до тек пор, пока с клавиатуры
	не будет введена буква S
*/

class ForTest{
	public static void main(String args[]) throws java.io.IOException{
		int i;
		System.out.println("Для остановкип нажмите класишу S");
		for(i = 0;(char) System.in.read() != 'S'; i++){
			System.out.println("Проход №" + i);
		}
		
	}
}
	