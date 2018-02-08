/*
	Неожиданный результат повышения типов
*/

class PromDemo{
	public static void main(String args[]){
		byte b;
		int i;
		
		b = 10;
		i = b * b;
		
		b = 10;
		b = (byte)(b * b);
		

		System.out.println("i и b: " + i +" " + b );
		
		char ch1 = 'a', ch2 = 'b';
		System.out.println("a + b: " + (ch1 + ch2));
		ch1 = (char)(ch1 + ch2);
		System.out.println("ch1: " + ch1);
	}
}