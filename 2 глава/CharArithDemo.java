/*
	C символьными переменными можно обращатьсЯ как с целочисленными
*/

class CharArithDemo{
	public static void main(String args[]){
		char ch;
		
		ch = 'X';
		System.out.println("ch содержит: " + ch);
		
		ch++;//ch можно инкрементировать
		System.out.println("ch++ содержит: " + ch);
		
		ch = 90;//ch можноприсвоить значение Z
		System.out.println("ch = 90 содержит: " + ch);
	}
}