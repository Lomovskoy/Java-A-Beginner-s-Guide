/*
	������������� ����� ����� ������� ��������
*/

class BreakErr{
	public static void main(String args[]) throws java.io.IOException{
		one: for(int x = 0; x < 5; x++){
				for(int y = 0; y < 5; y++){
					if(y == 2) ;
						System.out.println("x � y: " + x + " " + y);
				}
		}
		System.out.println();
		
		//����� ����� ������������� ��������������� 
		//����� ������������ �������
		for(int x = 0; x < 5; x++) {
			for(int y = 0; y < 5; y++){
					if(y == 2) break one;
						System.out.println("x � y: " + x + " " + y);
				}
		}
	}
}	