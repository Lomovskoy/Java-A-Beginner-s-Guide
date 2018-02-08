/*
	Демонстрация многоступенчатой конструкции if-else-if
*/

class Ladder{
	public static void main(String args[]){
		
		for(int x = 0; x < 6; x++){
			
			if(x == 1)
				System.out.println("X = " + x);
			else if(x == 2)
				System.out.println("X = " + x);
			else if(x == 3)
				System.out.println("X = " + x);
			else if(x == 4)
				System.out.println("X = " + x);
			else
				System.out.println("X находится вне диапазона 1-4");
		}
	}
}
	