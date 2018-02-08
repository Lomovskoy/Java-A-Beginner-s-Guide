/*
	Демонстрацияавтоматического преобразования типов
*/

class CastDemo{
	public static void main(String args[]){
		long L;
		double D;
		
		D = 100123285.0;
		L = D;//Ошибка
		
		System.out.println("L и D: " + L + " " + D);
	}
	
}