/*
	���������� 1.2
	
	��� ��������� ���������� ������� �������� ����� � �����.
	
	��������� ����� � �������� ����� ��� InchesToMetersTable
*/

class InchesToMetersTable{
	public static void main(String args[]){
		double inches,meters;
		int counter;
		
		counter = 0;
		
		for(inches = 1; inches <=144; inches++){
			meters = inches * 0.02540000000000031; //������������� � �����
			System.out.println(inches + " ����� = " + meters);
			counter++;
			if(counter == 12){
				System.out.println();
				counter = 0;//�������� ������� ����
			}
		}
	}
}