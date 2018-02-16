/*
	�����, ����������� ���� ��� �������� ��������
*/
	
class Stack{
	char q[];			//������ ��� �������� ��������� �����
	int putloc, getloc;	//������� ��� ������� � ���������� ��������� �����
	
	Stack(int size){
		q = new char[size + 1];//�������� ������ ��� �����
		putloc = getloc = 0;
	}
	
	//��������� ������ � ����
	void put(char ch){
		if(putloc == q.length - 1){
			System.out.println(" - ���� ��������");
			return;
		}
		putloc++;
		q[putloc] = ch;
	}
	
	//������ ������ �� �����
	char get(){
		getloc = putloc;
		if(getloc == 0){
			System.out.println(" - ���� ����");
			return (char) 0;
		}
		putloc--;
		return q[getloc];
	}
}	
	
//������������ ������������ ������ Stack
class StackDemo{
		
	public static void main(String args[]) {
		Stack bigS = new Stack(100);
		Stack smallS = new Stack(4);
		char ch;
		int i;
		
		System.out.println("������������� ����� bigS ��� ���������� ��������");
		//��������� ��������� ������� � ���� bigS
		for(i=0; i < 26; i++)
			bigS.put((char) ('A' + i));
		
		//������� ��������� ������� � ���� bigS
		System.out.println("���������� ����� bigS: ");
		for(i=0; i < 26; i++){
			ch = bigS.get();
			if(ch != (char) 0) System.out.print(ch);
		}
		
		System.out.println("\n");
		
		System.out.println("������������� ����� smallS ��� ��������� ������");
		//������������ ����� smallS ��� ��������� ������
		for(i=0; i < 5; i++){
			System.out.print("������� ���������� " + (char)('Z' - i));
			smallS.put((char)('Z' - i));
			System.out.println();
		}
		System.out.println();
		
		//���������� ������ ��� ��������� � ������� smallS
		System.out.print("���������� smallS: ");
		for(i=0; i < 5; i++){
			ch = smallS.get();
			if(ch != (char) 0) System.out.print(ch);
		}
	}
}