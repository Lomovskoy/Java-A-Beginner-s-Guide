/*
	ќтображение битов составл€ющий байт
*/
	
class ShouBits{
		
	public static void main(String args[]) {
			
		byte val = 123;
		
		for(int t = 128; t > 0; t /= 2){
			if((val & t) != 0) System.out.print("1 ");
			else System.out.print("0 ");
		}
	}
}