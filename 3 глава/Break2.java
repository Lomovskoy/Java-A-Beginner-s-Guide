/*
	���������� ��������� break ��� ������ �� �����
*/

class Break2{
	public static void main(String args[]) throws java.io.IOException{
		
		char ch;
		
		//��������� ���� �� ��� ���, ���� ������� ��������
		//���������� i ������ ��������� ���������� num
		for(;;){
			ch = (char) System.in.read();//�������� ������ � ����������
			if(ch == 'q') break;
		}
		System.out.print("�� ������������� q");
	}
}
	