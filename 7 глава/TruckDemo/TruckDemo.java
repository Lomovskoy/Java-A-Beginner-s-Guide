/*
	Упражнение 7.1
	Создание подкласса класса Vhehicle для грузовиков
*/
class Vhehicle{
	private int passenger;	//колисчество пассажиров
	private int fuelcap;	//ёмкость топливного бака
	private int mpg;		//потрибление топливо в милях на галлон
	
	//Это конструктор класса с параметрами
	Vhehicle(int p, int f, int m){
		passenger = p;
		fuelcap = f;	
		mpg = m;
	}
	
	//Возвратить дальность поездки транспортного средства
	int range(){
		return fuelcap * mpg;
	}
	
	//Рассчитать обьём топлива, необходимого транспортному
	//средству для преодоления заданного расстояния
	double fuelneeded(int miles){
		return (double) miles / mpg;
	}
	
	//Методы доступа к переменным экземпляра
	int getPassenger(){return passenger;}
	void setPassenger(int p){passenger = p;}
	int getFuelcap(){return fuelcap;}
	void setFuelcap(int f){fuelcap = f;}
	int getMpg(){return mpg;}
	void setMpg(int m){mpg = m;}
}

//Расширегие класса Vhehicle дял грузовиков
class Truck extends Vhehicle{
	private int cergocap;
	
	//Конструктор класса Truck
	Truck(int p, int f, int m, int c){
		//использвоание конструктора суперкласса
		super(p, f, m);
		cergocap = c;
	}
	
	//методы доступа к переменной cergocap
	int getCergo(){return cergocap;}
	void putCargo(int c){cergocap = c;}
}	

class TruckDemo{
	public static void main(String args[]) {
		
		//Создать рад новых обьектов типа Truck
		Truck semi = new Truck(2, 200, 7, 44000);
		Truck pickup = new Truck(3, 28, 15, 2000);
		
		double gallons;
		int dist = 252;
		
		gallons = semi.fuelneeded(dist);
		
		System.out.println("Грузовик модет перевезти " + 
			semi.getCergo() + " фунтов.");
			
		System.out.println("Для преодоления " + dist +
			" миль грузовику потребуется " + gallons + 
			" галлонов топлива.\n");
			
		gallons = pickup.fuelneeded(dist);
		
		System.out.println("Пикап модет перевезти " + 
			pickup.getCergo() + " фунтов.");
			
		System.out.println("Для преодоления " + dist +
			" миль грузовику потребуется " + gallons + 
			" галлонов топлива.\n");
	}
}
