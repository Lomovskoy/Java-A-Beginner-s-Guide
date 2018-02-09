/*
	Применение оператора break для вложенных циклах
*/

class Break3{
	public static void main(String args[]) throws java.io.IOException{
		
		for(int i =0; i < 3; i++){
			System.out.println("Счётчик внешнего цикла: " + i);
			System.out.print("    Счётчик внутреннего цикла: ");
			
			int t = 0;
			while(t < 100){
				if(t == 10) break;//Прервать цикл
					System.out.print(t + " ");
				t++;
			}
			System.out.println();
		}
		System.out.print("Цыклы завершены");
	}
}
	