/*
	���������� ������������������ ���������� ����������
*/
	
class Phone{
		
	public static void main(String args[]) {
			
		String numbers[][] = {
			{"���", "555-55-55"},
			{"�����", "222-22-22"},
			{"����", "666-66-66"},
			{"������", "889-25-55"}
		};
		int i;
		
		//��� ����, ��� ����������������� ����������,
		//�� ����� �������� ���� �������� ��������� ������
		if(args.length != 1)
			System.out.println("�������������: Java Phone <���>");
		else{
			for(i=0; i<numbers.length; i++){
				if(numbers[i][0].equals(args[0])){
					System.out.println(numbers[i][0]+" : "+numbers[i][1]);
					break;
				}
			}
			if(i == numbers.length)
				System.out.println("��� �� ��������");
		}
		
	}
}