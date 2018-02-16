/*
	�������� ����� swap(), ���������� ����� ���������� ����� ����� 
	��������� Test, �� ������� ��������� ��� ���������� ������� ����.
*/
class Test{
	
	int a;
	
	Test(int a){
		this.a = a;
	}
	//����� ��� ��������� �������� �� ������ 
	public int swap(){
		return a;
	}
	
	//����������� ���� ��� ��������� �������� � ������
	public void swap(int a){
		this.a = a;
	}
}
	

class TestDemo{
		
	public static void main(String args[]) {
		
		Test test1 = new Test(4);
		Test test2 = new Test(2);
		System.out.println("������ 2 ������� ����1 � ����2");
		System.out.println("���������� ����1: " + test1.a);
		System.out.println("���������� ����2: " + test2.a);
		System.out.println("������ ����2 - ������� ���������� ����1");
		test1.swap(test2.swap());
		System.out.println("���������� ����1: " + test1.a);
		System.out.println("���������� ����2: " + test2.a);
	}
}