/*
	������������ ���������� ��������� if
	
	��������� ����� � �������� ����� ��� ForDemo.java
*/
class ForDemo{
	public static void main(String args[]){
		int count;
		
		for(count = 0; count < 5; count = count + 1)
			System.out.println("�������� ��������: " + count);
		
		System.out.println("������!");
		System.out.println();
		
		for(count = 5; count > 0; count--)
			System.out.println("�������� ��������: " + count);
		
		System.out.println("������!");
		System.out.println();
		
		for(count = 0; count < 5; count++)
			System.out.println("�������� ��������: " + count);
		
		System.out.println("������!");
		System.out.println();
	}
}