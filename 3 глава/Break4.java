/*
	Применение оператора break c меткой
*/

class Break4{
	public static void main(String args[]) throws java.io.IOException{
		
		for(int i = 1; i < 4; i++){
			one:{
				two:{
					three:{
						System.out.println("\ni = " + i);
						if(i == 1) break one;
						if(i == 2) break two;
						if(i == 3) break three;
					}
					System.out.println("После блока three");
				}
				System.out.println("После блока two");
			}
			System.out.println("После блока one");
		}
		System.out.println("После цикла for");
	}
}	