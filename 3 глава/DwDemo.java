/*
	������������ ����� Do-While
*/

class DwDemo{
	public static void main(String args[]) throws java.io.IOException{
		
		char ch;
		
		do{
			System.out.println("������� ������ �������, � ����� ������� Enter");
			ch = (char)System.in.read();//�������� ������ ����� � ����������
		}while (ch != 'q');

	}
	
}
	