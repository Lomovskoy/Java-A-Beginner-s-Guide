/*
	��������� ���������� ����� for � ����� ����� 
*/

class ForVar{
	public static void main(String args[]) throws java.io.IOException{
		int fact = 1, sum = 0;
		
		//����������� ����������� ����� �� 1 �� 5
		for(int i = 1; i <= 5; i++){
			//���������� i �������� � ���� �����
			sum += i;
			fact *= i;
		}
		
		//������ ����� ���������� i �� ��������
		System.out.println("����� = " + sum);
		System.out.println("��������� = " + fact);
	}
}
	