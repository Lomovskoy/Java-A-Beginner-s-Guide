/*
	���������� 1 ����� 3
	��������� ������� �������� �������, � ����������,
	�� ��� ��� ���� �� ���������� �����.
	��������� ���������� �������� ������.
*/

class Exercise1{
	public static void main(String args[]) throws java.io.IOException{
		
		int space = 0;
		char choice, ignore;
		while(true){
			System.out.print("������� ����� ������ � ������� Enter ");
			System.out.println("- ������ . �������� ���������");
			choice = (char) System.in.read();
			System.out.println();
			do{
				ignore = (char) System.in.read();
			} while(ignore != '\n');
			if(choice == '.') break;
			else if(choice == ' ') space += 1;
		}
		System.out.println("�� ����� " + space + " ��������");
	}
}
	