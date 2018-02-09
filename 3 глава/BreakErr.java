/*
	Располождение метки имеет большое значение
*/

class BreakErr{
	public static void main(String args[]) throws java.io.IOException{
		one: for(int x = 0; x < 5; x++){
				for(int y = 0; y < 5; y++){
					if(y == 2) ;
						System.out.println("x и y: " + x + " " + y);
				}
		}
		System.out.println();
		
		//Здесь метка распологается непосредственно 
		//перед открываюийся скобкой
		for(int x = 0; x < 5; x++) {
			for(int y = 0; y < 5; y++){
					if(y == 2) break one;
						System.out.println("x и y: " + x + " " + y);
				}
		}
	}
}	