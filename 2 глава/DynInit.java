/*
	Демонстрация динамической инициализации
*/

class DynInit{
	public static void main(String args[]){
		double radius = 4, height = 5;
		
		//Переменная volume инициализируется динамически
		//во время выполнения программ
		double volume = 3.1416 * radius * radius * height;
		
		System.out.println("Обьем цилинтра = " + volume);
	}
	
}