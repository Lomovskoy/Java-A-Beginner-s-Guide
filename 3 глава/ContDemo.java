/*
	Переменные оператора Continue с меткой
*/

class ContDemo{
	public static void main(String args[]) throws java.io.IOException{
		
		outerloop:
		for(int i = 0; i <= 10; i++){
			System.out.print("\nВнешний цикл проход " + i + ", внутренний цикл: ");
			for(int j = 0; j <= 10; j++){
				if(j == 5) continue outerloop;//Продолжить внешний цикл
				System.out.print(j);
			}
		}
	}
}	