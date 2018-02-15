/*
	���������� ������� � ���������� ������ ����������
	� ��������������� � ������ ������������� ������.
	� ����� ��������� ������� ������, �
	������� ��� �� ����� ���������������.
*/
	
class VarArgsErr{
	
	//������������ ������ ���������� ���������� ������� ���� int
	static void vaTest(int ... v){
		//...
	}
	
	//������������ ������ ���������� ���������� ������� ���� boolean
	static void vaTest(boolean ... v){
		//...
	}
	
	static void vaTest(String msg, int ... v){
		System.out.println("vaTest(String msg, int ... v): " 
			+ msg + v.length);
		System.out.println("����������: ");
		
		for(int i=0; i < v.length; i++)
			System.out.println("arg " + i + ": " + v[i]);
		
		System.out.println();
	}
	
	public static void main(String args[]) {
		
		vaTest(1, 2, 3);			//OK
		vaTest(true, false, false);	//OK
		vaTest();					//Err
	}
}