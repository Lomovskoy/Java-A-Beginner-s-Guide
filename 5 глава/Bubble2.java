/*
	�������� ���������, ���������� � ���������� 5.1, ����� �������, ����� ���
	����������� ������ ���������� �����. ����������������� �� �����������������.
*/
	
class Bubble2{
		
	public static void main(String args[]) {
			
		char nums[] ={'c', 'b', 'a', 'd', 'f', 
					'i', 'g', 'h', 'x', 'w'};
		char t;
		//���������� �������� ������
		System.out.print("�������� ������: ");
		for(int i = 0; i < nums.length; i++)
			System.out.print(" " + nums[i]);
		System.out.println();
		
		//����������� �������� ����������� ����������
		for(int a = 1; a < nums.length; a++)
			for(int b = nums.length - 1; b >= a; b--){
				//���� ��������� ������� ���������� �� �����������,
				//�������� �������� �������
				if(nums[b-1] > nums[b]){
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
				}
			}
		
		//���������� ��������������� ������
		System.out.print("��������������� ������: ");
		for(int i = 0; i < nums.length; i++)
			System.out.print(" " + nums[i]);
		System.out.println();
	}
}