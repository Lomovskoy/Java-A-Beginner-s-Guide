/*
	����� � ������� � ������������� ������������ 
	����� for
*/
	
class Search{
		
	public static void main(String args[]) {
			
		int nums[] = {0, 2, 9, 4, 8, 5, 6, 3, 1};
		int val = 5;
		boolean font = false;
		
		//������������ ���� for-each ��� ������
		//�������� ���������� val � ������� nums
		for(int x : nums){
			if(x == val){
				font = true;
				break;
			}
		}
		if(font)
			System.out.println("�������� ��������");
	}
}