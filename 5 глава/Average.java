/*
	�������� ���������, � ������� ������ ������������ ��� ���������� ��������
	��������������� ������ �������� ���� double. ����������� ����� ������ �����.
*/
	
class Average{
		
	public static void main(String args[]) {
		
		double[] samples = {
			1.12, 29.32, 65.045, 0.112, 74.321, 
			12.0, 444.34, 96.1, 930.11, 43.045};
		double summ = 0.0;
		double average = 0.0;
		
		for(double sample : samples)
			summ += sample;
	
		System.out.print("������� �������������� �������: " 
			+ (summ / samples.length));
	}
}