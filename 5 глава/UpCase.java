/*
	�������������� �������� ���� ����������� �������� � ���������
*/
	
class UpCase{
		
	public static void main(String args[]) {
			
		char ch;
		
		for(int i=0; i < 26; i++){
			ch = (char)('a' + i);
			System.out.print(ch);
			
			//� ��������� �������� ������������ ������ ���.
			//����� ����� � ���������� ch ����� ��������� ���
			//������� ��������� �����
			ch = (char) ((int) ch & 65503);
			System.out.print(ch+" ");
		}
		
	}
}