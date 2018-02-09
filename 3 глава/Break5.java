/*
	Применение оператора break c меткой
*/

class Break5{
	public static void main(String args[]) throws java.io.IOException{
		done:
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				for(int k = 0; k < 10; k++){
					System.out.println(k + " ");
					if (k == 5) break done;//Переход к метке done
				}
				System.out.println("После цикла for k");
			}
			System.out.println("После цикла for j");
		}
		System.out.println("После цикла for i");
	}
}	