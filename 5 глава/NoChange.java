/*
	Использовать разновидность for-each цикла for
*/
	
class NoChange{
		
	public static void main(String args[]) {
			
		int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int x : nums){
			System.out.print(x + " ");
			//Эта операция не изменяет значение nums
			x *= 10;
		}
		System.out.println();
		
		for(int x : nums){
			System.out.print(x + " ");
		}
		
		System.out.println();
	}
}