/*
	���������� ��������� Continue � ������
*/

class ContDemo{
	public static void main(String args[]) throws java.io.IOException{
		
		outerloop:
		for(int i = 0; i <= 10; i++){
			System.out.print("\n������� ���� ������ " + i + ", ���������� ����: ");
			for(int j = 0; j <= 10; j++){
				if(j == 5) continue outerloop;//���������� ������� ����
				System.out.print(j);
			}
		}
	}
}	