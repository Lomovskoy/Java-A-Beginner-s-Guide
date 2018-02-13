/*
	Использование расширенного цикла for
	для обработки двумерного массива
*/
	
class ForEach2{
		
	public static void main(String args[]) {
			
		int nums[][] = new int[3][5];
		int summ = 0;
		
		//Вывести ряд значений в массив nums
		for(int i=0; i < 3; i++)
			for(int j=0; j < 5; j++)
				nums[i][j] = (i+1)*(j+1);
		
		//Использовать разновидность for-each цикла
		//для суммирования и отображения значений.
		//Обратите внимание на обьявление переменной х
		for(int x[] : nums){
			for(int y : x){
				System.out.println("Значение: " + y);
				summ += y;
			}
		}
		System.out.println("Cумма: " + summ);
	}
}