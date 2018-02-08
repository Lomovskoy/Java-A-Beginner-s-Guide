/*
	Демонстрация времпени жизни переменной
*/

class VarInitDemo{
	public static void main(String args[]){
		int x;

		for(x = 0; x < 3; x++){
			
			int y = -1;//Эта переменная инциализируется при каждом бвходе в блок
			
			//Всегда выводится -1
			System.out.println("y: " + y);
			y = 2;
			System.out.println("Изменённое y: " + y);
		}

	}
	
}