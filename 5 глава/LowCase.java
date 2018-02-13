/*
	ѕреобразование прописных букв в строчные
*/
	
class LowCase{
		
	public static void main(String args[]) {
			
		char ch;
		
		for(int i=0; i<10; i++){
			ch = (char) ('A' + i);
			System.out.print(ch);
		
			//¬ результате установки в единицу 6го бита значени€
			//переменна€ ch она всегда будет прописную букву
			ch = (char) ((int) ch | 32);
			
			System.out.print(ch + " ");
		}
	}
}