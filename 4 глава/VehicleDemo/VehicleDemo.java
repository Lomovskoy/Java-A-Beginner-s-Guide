/*
	��������� � ������� ������������ ����� Vhehicle
	
*/
class Vhehicle{
	int passenger;	//����������� ����������
	int fuelcap;	//������� ���������� ����
	int mpg;		//����������� ������� � ����� �� ������
}

//� ������� ������ ����������� ����� ������ Vhehicle
class VehicleDemo{
	public static void main(String args[]) {
		Vhehicle minivan = new Vhehicle();
		int range;
		
		//��������� �������� ����� ������ minivan
		minivan.passenger = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		//������ ��������� ������� ��� ������ ����
		range = minivan.fuelcap * minivan.mpg;
		System.out.println("����-������ ����� ��������� " + 
			minivan.passenger + " ���������� �� ���������� " + 
			range + " ����.");
	}
}
