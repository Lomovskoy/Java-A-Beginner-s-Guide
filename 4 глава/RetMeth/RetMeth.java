/*
	������������� ������������� ��������
	
*/
class Vhehicle{
	int passenger;	//����������� ����������
	int fuelcap;	//������� ���������� ����
	int mpg;		//����������� ������� � ����� �� ������
	
	//�������� ��������� �������
	int range(){
		return mpg * fuelcap;
	}
}

//� ������� ������ ����������� ����� ������ Vhehicle
class RetMeth{
	public static void main(String args[]) {
		//��� 2 ���������� ��������� �� ������ �������
		Vhehicle minivan = new Vhehicle();
		Vhehicle sportcar = new Vhehicle();
		
		int range1, range2;
		
		//��������� �������� ����� ������ minivan
		minivan.passenger = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		//��������� �������� ����� ������ sportcar
		sportcar.passenger = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;
		
		//��������� ��������� ������� ��� ������ ����
		range1 = minivan.range();
		range2 = sportcar.range();
		
		System.out.println("����-������ ����� ��������� " + 
			minivan.passenger + " ���������� �� ���������� " + 
			range1 + " ����.");
		System.out.println("C��������� ���������� ����� ��������� " + 
			sportcar.passenger + " ���������� �� ���������� " + 
			range2 + " ����.");
	}
}
