/*
	Обьвление переменныц уикла for в самом цикле 
*/

class ForVar{
	public static void main(String args[]) throws java.io.IOException{
		int fact = 1, sum = 0;
		
		//Вычиследние факториалов чисел от 1 до 5
		for(int i = 1; i <= 5; i++){
			//Переменная i доступна в теле цикла
			sum += i;
			fact *= i;
		}
		
		//Однако здесь переменная i не доступна
		System.out.println("Сумма = " + sum);
		System.out.println("Факториал = " + fact);
	}
}
	