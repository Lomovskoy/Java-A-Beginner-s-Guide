/*
	�����, ����������� ������� ��� �������� ��������
*/
	
class Queue{
	// ��� ����� ������ ������ �������� ���������
	private char q[]; 			// ������ ��� �������� ��������� �������
	private int putloc, getloc; // ������� ��� ������� � ���������� ��������� �������
	
	// �����������, ��������� ���� ������ ���� Queue
	// �� ������ �������
	Queue(Queue ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];
		
		// ���������� �������� �������
		for(int i = getloc + 1; i <= putloc; i++)
			q[i] = ob.q[i];
	}
	
	// ��������������� � ������������� ������� ���� Queue
	Queue (char a[]) {
		putloc = 0;
		getloc = 0;
		q = new char[a.length+1];
		
		for(int i = 0; i < a.length; i++) 
			put(a[i]);
	}

	// ��������������� ������ ������� ��������� �������
	Queue (int size) {
		q = new char[size+1];	// �������� ������ ��� �������
		putloc = getloc = 0;
	}
	
	// ��������� ������ � �������
	void put(char ch) {
		if(putloc == q.length-1){
			System.out.println(" - ������� ���������.");
			return;
		}
		
		putloc++;
		q[putloc] = ch;
	}
	
	// ������� ������ �� �������
	char get(){
		if (getloc == putloc) {
			System.out.println(" - ������� �����.");
			return (char) 0;
		}
		getloc++;
		return q[getloc];
	}
}	
	
//������������ ������������ ������ Queue
class QDemo3{
		
	public static void main(String args[]) {
		
		// ������� ������ ������� ��� �������� 10 ���������
		Queue ql = new Queue(10);
		char name[] = {'�', 'o', 'm'};
		
		// ������� ������� �� ������ �������
		Queue q2 = new Queue(name);
		char ch;
		int i;
		
		// ��������� ��� �������� � ������� ql
		for(i=0; i < 10; i++)
			ql.put ((char) ('�' + i));
	
		// ������� ���� ������� �� ������ ������
		Queue q� = new Queue(ql);
		
		// �������� �������
		System.out.print("Co�ep���oe ql: ");
		
		for (i=0; i < 10; i++) {
			ch = ql.get();
			System.out.print(ch);
		}
		System.out.println("\n");
		
		System.out.print("Co�ep���oe q2: ");
		for (i=0; i < 3; i++) {
			ch = q2.get();
			System.out.print(ch);
		}
		System.out.println("\n");
		
		System.out.print("Co�ep���oe q�: ");
		for (i=0; i < 10; i++) {
			ch = q�.get();
			System.out.print(ch);
		}

	}
}