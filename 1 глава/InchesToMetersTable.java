/*
	Упражнение 1.2
	
	Эта программа отображает таблицу перевода ьетры в дюймы.
	
	Присвойте файлу с исходным кодом имя InchesToMetersTable
*/

class InchesToMetersTable{
	public static void main(String args[]){
		double inches,meters;
		int counter;
		
		counter = 0;
		
		for(inches = 1; inches <=144; inches++){
			meters = inches * 0.02540000000000031; //Преобразовать в метры
			System.out.println(inches + " дюйма = " + meters);
			counter++;
			if(counter == 12){
				System.out.println();
				counter = 0;//Сбросить счётчик слов
			}
		}
	}
}