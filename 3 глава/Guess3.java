/*
	������ �������� � ���������� 3 ������
*/

class Guess3{
	public static void main(String args[])
		throws java.io.IOException{
			char ch, answer = 'S';
			System.out.println("��������� ����� �� A �� Z");
			System.out.print("����������� � ��������: ");
			ch = (char) System.in.read();//�������� ������ � ����������
			
			if(ch == answer) System.out.print("*** ��������� ***");
			else {
				System.out.println("*** �� ��������� ***");
				//��������� ��������
				if(ch < answer)
					System.out.print("*** �������� ������ ��������� ����� � ����� �������� ***");
				else
					System.out.print("*** �������� ������ ��������� ����� � ������ �������� ***");
			}
		}
	}
	