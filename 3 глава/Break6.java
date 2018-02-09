/*
	Располождение метки имеет большое значение
*/

class Break6{
	public static void main(String args[]) throws java.io.IOException{
		stop1: for(int x = 0; x < 5; x++){
				for(int y = 0; y < 5; y++){
					if(y == 2) break stop1;
						System.out.println("x и y: " + x + " " + y);
				}
		}
		System.out.println();
		
		//Здесь метка распологается непосредственно 
		//перед открываюийся скобкой
		for(int x = 0; x < 5; x++) stop2: {
			for(int y = 0; y < 5; y++){
					if(y == 2) break stop2;
						System.out.println("x и y: " + x + " " + y);
				}
		}
	}
}	