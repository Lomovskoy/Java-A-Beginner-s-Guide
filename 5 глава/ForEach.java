/*
	������������ ������������� for-each ����� for
*/
	
class ForEach{
		
	public static void main(String args[]) {
			
		int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int summ = 0;
		
		//������������ ������������� for-each ����� for
		//��� ������������ � ����������� ��������
		for(int x : nums){
			System.out.println("��������: " + x);
			summ += x;
		}
		System.out.println("�����: " + summ);
	}
}