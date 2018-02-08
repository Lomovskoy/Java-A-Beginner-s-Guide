/*
	Неожиданный результат повышения типов
*/

class PrimeNumber{
	public static void main(String args[]){
		
		for(int i = 0; i < 5; i++){
			System.out.println(i+ " / 3: " + i / 3);
			System.out.println(i+ " / 3 с дробной частью: " + (double)i / 3);
		}
	}
}