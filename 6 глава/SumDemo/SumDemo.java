/*
	Инициализация одного объекта посредством другого
*/

class Sumrnation {
	int sum;
	
	// Создать объект на основе целочисленного значения
	Sumrnation(int num) {
		sum = 0;
		for(int i=1; i <= num; i++)
			sum += i;
	}
	
	// Создать один объект на основе другого
	Sumrnation(Sumrnation ob) {
		sum = ob.sum;
	}
}

class SumDemo{
	
	public static void main(String args[]) {
		
		Sumrnation sl = new Sumrnation(5);
		Sumrnation s2 = new Sumrnation(sl);
		System.out.println("sl.sum: " + sl.sum);
		System.out.println("s2.sum: " + s2.sum);
		
	}
}
