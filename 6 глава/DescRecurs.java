/*
	Напишите рекурсивный метод, отображающий символы, 
	составляющие строку в обратном порядке
*/

class DescRecurs{
	
	/*static char[] iterate(char str[]){
		char result[] = new char[str.length];
		
		for(int ch = str.length-1; ch >=0; ch--){
			result[i] = str[ch];
			i++;
		}
		
		return result;
	}*/
	
	static void recurs(char str[], int i){
		
		if(i >= 0){
			System.out.print(str[i]);
			recurs(str, i-1);
		}else{
			return;
		}
	}
		
	public static void main(String args[]) {
		
		char str[] = {'K','i','r','i','l','l'};
		
		System.out.println("Исходный массив символов");
		for(char ch : str)
			System.out.print(ch);
		
		System.out.println("\nРазвёрнутый массив символов");
		recurs(str, str.length-1);
		
	}
}