/*
	���������� �������
*/
class Overload {
	
	void ovlDemo() { 
		System.out.println("�e� ����������");
	}
	
	// ���������� ������ ovlDemo ��� ������ ��������� ���� int
	void ovlDemo(int �) {
		System. out. println ( "���� ��������: " + �);
	}
	
	// ���������� ������ ovlDemo ��� ���� ���������� ���� int
	int ovlDemo(int �, int b) {
		System.out.println("��a ���������: " + � + " " + b);
		return � + b;
	}
	
	// ���������� ������ ovlDemo ��� ���� ���������� ���� double
	double ovlDemo(double �, double b) {
		System.out.println("��a ��������� ���� double: " +
			� + " " + b);
		return � + b;
	}
	
	
	
}
class OverloadDemo{
	
	public static void main(String args[]) {
		
		Overload ob = new Overload();
		int resI;
		double resD;
		
		// ���������� ������� ��� ������ ������ ovlDemo()
		ob.ovlDemo();
		System.out.println();
		
		ob.ovlDemo(2);
		System.out.println();
		
		resI = ob.ovlDemo(4, 6);
		System.out.println("Pe�y���a� ������ ob.ov1Demo(4, 6): " + resI);
		System.out.println();
		
		resD = ob.ovlDemo(1.1, 2.32);
		System.out.println("Pe�y���a� ������ ob.ovlDemo(l.l, 2.32): " + resD);

	}
}
