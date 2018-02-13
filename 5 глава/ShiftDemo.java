/*
	ƒемонстраци€ использовани€операции << и >>
*/
	
class ShiftDemo{
		
	public static void main(String args[]) {
			
		int val = 1;
		
		for(int i = 0; i < 8; i++){
			for(int t = 128; t > 0; t /= 2){
				if((val & t) != 0) System.out.print("1 ");
				else System.out.print("0 ");
			}
			System.out.print("\n");
			val <<= 1;//—двинуть в лево
		}
		System.out.print("\n");
		
		val = 128;
		for(int i = 0; i < 8; i++){
			for(int t = 128; t > 0; t /= 2){
				if((val & t) != 0) System.out.print("1 ");
				else System.out.print("0 ");
			}
			System.out.print("\n");
			val >>= 1;//—двинуть в парво
		}
	}
}