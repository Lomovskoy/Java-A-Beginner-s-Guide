/*
	В этой программе предпринимается попытка объявить во внутренне области 
	действия переменную с таким де именем, как и у переменной, обьявленной
	во внешней области действия. Эта программа не пройдёт компиляции
*/

class NestVar{
	public static void main(String args[]){
		int count;

		for(count = 0; count < 3; count++){
			System.out.println("Значение count: " + count);
			
			int count;//Недопустимо
			for(count = 0; count < 3; count++){
				System.out.println("В этой программе есть ошибка");
				
			}
		}

	}
	
}