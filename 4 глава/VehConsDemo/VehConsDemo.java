/*
	���������� ������������ � ����� ����� Vhehicle
	
*/
class Vhehicle{
	int passenger;	//����������� ����������
	int fuelcap;	//������� ���������� ����
	int mpg;		//����������� ������� � ����� �� ������
	
	//��� ����������� ������ � �����������
	Vhehicle(int p, int f, int m){
		passenger = p;
		fuelcap = f;	
		mpg = m;
	}
	
	//���������� ��������� ������� ������������� ��������
	void range(){
		System.out.println("���������� ������� - " + fuelcap * mpg + " ����.");
	}
	
	//���������� ����� �������, ������������ �������������
	//�������� ��� ����������� ��������� ����������
	double fuelneeded(int miles){
		return (double) miles / mpg;
	}
}

//� ������� ������ ����������� ����� ������ Vhehicle
class VehConsDemo{
	public static void main(String args[]) {
		
		//��������� ��������������� ������� ������������ �������
		Vhehicle minivan = new Vhehicle(7, 16, 21);
		Vhehicle sportcar = new Vhehicle(2, 14, 12);
		
		double gallons;
		int dist = 252;
		
		gallons = minivan.fuelneeded(dist);
		
		System.out.println("��� ����������� " + dist + 
			" ���� ����-������� ����������� " + 
			gallons + " �������� �������");
		
		gallons = sportcar.fuelneeded(dist);
		
		System.out.println("��� ����������� " + dist + 
			" ���� ����������� ���������� ����������� " + 
			gallons + " �������� �������");
	}
}
