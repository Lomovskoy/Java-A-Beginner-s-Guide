/*
	���������� ������ range() � ����� Vehicle
	
*/
class Vhehicle{
	int passenger;	//����������� ����������
	int fuelcap;	//������� ���������� ����
	int mpg;		//����������� ������� � ����� �� ������
	
	//���������� ��������� ������� ������������� ��������
	void range(){
		System.out.println("���������� ������� - " + fuelcap * mpg + " ����.");
	}
}

//� ������� ������ ����������� ����� ������ Vhehicle
class AddMeth{
	public static void main(String args[]) {
		//��� 2 ���������� ��������� �� ������ �������
		Vhehicle minivan = new Vhehicle();
		Vhehicle sportcar = new Vhehicle();
		
		//��������� �������� ����� ������ minivan
		minivan.passenger = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		//��������� �������� ����� ������ sportcar
		sportcar.passenger = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;
		
		System.out.println("����-������ ����� ��������� " + 
			minivan.passenger + " ����������");
		minivan.range();//��������� ������� ���� �������
			
		System.out.println("C��������� ���������� ����� ��������� " + 
			sportcar.passenger + " ����������");
		sportcar.range();//��������� ������� ����������� ����������
	}
}
