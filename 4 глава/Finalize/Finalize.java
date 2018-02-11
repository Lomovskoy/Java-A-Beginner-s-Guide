/*
	���������� 4.2
	������������ ������ ������ � ������ finalize
*/
class FDemo{
	
	int x;
	
	FDemo(int i){
		x = i;
	}
	
	//���������� ��� �������� �������
	protected void finalize(){
		System.out.println("������� ������ ������ ������: " + x);
	}
	
	//���������� ������ ������� ��� ��� �� ������������
	void generator(int i){
		FDemo o = new FDemo(i);
	}
}

class Finalize{
	
	public static void main(String args[]) {
		
		FDemo ob = new FDemo(0);
		
		/*	������������ ������� ���������� ��������.
			� ����� �� ������ ������ �������� ������ ������.
			����������: ��������, ��� ��������� ������ ������
			���������� ������������� �������� ����� ���������
		*/
		for(int count = 0; count < 10000000; count++){
			ob.generator(count);
		}
	}
}

