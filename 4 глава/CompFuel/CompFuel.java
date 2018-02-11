/*
	���������� �������������������� ������ � ������� ����������
	������ ������ �������, ������������ ������������� �������� ���
	����������� ��������� ����������.
*/
class Vhehicle{
	int passenger;	//����������� ����������
	int fuelcap;	//������� ���������� ����
	int mpg;		//����������� ������� � ����� �� ������
	
	//���������� ��������� ������� ������������� ��������
	int range(){
		return mpg * fuelcap;
	}
	
	//���������� ����� �������, ������������ �������������
	//�������� ��� ����������� ��������� ����������
	double fuelneeded(int miles){
		return (double) miles / mpg;
	}
}

//� ������� ������ ����������� ����� ������ Vhehicle
class CompFuel{
	public static void main(String args[]) {
		//��� 2 ���������� ��������� �� ������ �������
		Vhehicle minivan = new Vhehicle();
		Vhehicle sportcar = new Vhehicle();
		
		double gallons;
		int dist = 252;
		
		//��������� �������� ����� ������ minivan
		minivan.passenger = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		//��������� �������� ����� ������ sportcar
		sportcar.passenger = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;
		
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

