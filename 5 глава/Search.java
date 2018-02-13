/*
	ѕоиск в массиве с использование расширенного 
	цикла for
*/
	
class Search{
		
	public static void main(String args[]) {
			
		int nums[] = {0, 2, 9, 4, 8, 5, 6, 3, 1};
		int val = 5;
		boolean font = false;
		
		//»спользовать цикл for-each для поиска
		//значения переменной val в массиве nums
		for(int x : nums){
			if(x == val){
				font = true;
				break;
			}
		}
		if(font)
			System.out.println("«начение найденно");
	}
}