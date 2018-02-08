/*
	Упражнение 1.2
	
	Эта программа отображает таблицу перевода галона в литры.
	
	Присвойте файлу с исходным кодом имя GalToLitTable
*/

class GalToLitTable{
	public static void main(String args[]){
		double gallons,liters;
		int counter;
		
		counter = 0;
		
		for(gallons = 1; gallons <=100; gallons++){
			liters = gallons * 3.7854;//Преобразовать в литры
			System.out.println(gallons + " галонам соответствует " + 
								liters + " литра.");
			counter++;
			if(counter == 10){
				System.out.println();
				counter = 0;//Сбросить счётчик слов
			}
		}
	}
}