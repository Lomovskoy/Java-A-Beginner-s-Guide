/*
	�������� ���������� ����������
*/
class Factor{
	
	//������ true ���� � ������ ������
	boolean isFactor(int a, int b){
		if((b % a) == 0) return true;
		else return false;
	}
}

class IsFact{
	public static void main(String args[]){
		Factor x = new Factor();
		
		if(x.isFactor(2,20)) System.out.println("2 �������� 20");
		if(x.isFactor(3,20)) System.out.println("3 �������� 20");
		if(x.isFactor(4,40)) System.out.println("4 �������� 40");
	}
}
