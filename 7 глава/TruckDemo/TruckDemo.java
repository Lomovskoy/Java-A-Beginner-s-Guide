/*
	���������� 7.1
	�������� ��������� ������ Vhehicle ��� ����������
*/
class Vhehicle{
	private int passenger;	//����������� ����������
	private int fuelcap;	//������� ���������� ����
	private int mpg;		//����������� ������� � ����� �� ������
	
	//��� ����������� ������ � �����������
	Vhehicle(int p, int f, int m){
		passenger = p;
		fuelcap = f;	
		mpg = m;
	}
	
	//���������� ��������� ������� ������������� ��������
	int range(){
		return fuelcap * mpg;
	}
	
	//���������� ����� �������, ������������ �������������
	//�������� ��� ����������� ��������� ����������
	double fuelneeded(int miles){
		return (double) miles / mpg;
	}
	
	//������ ������� � ���������� ����������
	int getPassenger(){return passenger;}
	void setPassenger(int p){passenger = p;}
	int getFuelcap(){return fuelcap;}
	void setFuelcap(int f){fuelcap = f;}
	int getMpg(){return mpg;}
	void setMpg(int m){mpg = m;}
}

//���������� ������ Vhehicle ��� ����������
class Truck extends Vhehicle{
	private int cergocap;
	
	//����������� ������ Truck
	Truck(int p, int f, int m, int c){
		//������������� ������������ �����������
		super(p, f, m);
		cergocap = c;
	}
	
	//������ ������� � ���������� cergocap
	int getCergo(){return cergocap;}
	void putCargo(int c){cergocap = c;}
}	

class TruckDemo{
	public static void main(String args[]) {
		
		//������� ��� ����� �������� ���� Truck
		Truck semi = new Truck(2, 200, 7, 44000);
		Truck pickup = new Truck(3, 28, 15, 2000);
		
		double gallons;
		int dist = 252;
		
		gallons = semi.fuelneeded(dist);
		
		System.out.println("�������� ����� ��������� " + 
			semi.getCergo() + " ������.");
			
		System.out.println("��� ����������� " + dist +
			" ���� ��������� ����������� " + gallons + 
			" �������� �������.\n");
			
		gallons = pickup.fuelneeded(dist);
		
		System.out.println("����� ����� ��������� " + 
			pickup.getCergo() + " ������.");
			
		System.out.println("��� ����������� " + dist +
			" ���� ��������� ����������� " + gallons + 
			" �������� �������.\n");
	}
}
