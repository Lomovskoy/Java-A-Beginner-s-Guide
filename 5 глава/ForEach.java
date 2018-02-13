/*
	Использовать разновидность for-each цикла for
*/
	
class ForEach{
		
	public static void main(String args[]) {
			
		int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int summ = 0;
		
		//Использовать разновидность for-each цикла for
		//Для суммирования и отображения значений
		for(int x : nums){
			System.out.println("Значение: " + x);
			summ += x;
		}
		System.out.println("Сумма: " + summ);
	}
}