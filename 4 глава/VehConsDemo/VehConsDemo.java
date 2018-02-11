/*
	Добавлеине конструктора в класс класс Vhehicle
	
*/
class Vhehicle{
	int passenger;	//колисчество пассажиров
	int fuelcap;	//ёмкость топливного бака
	int mpg;		//потрибление топливо в милях на галлон
	
	//Это конструктор класса с параметрами
	Vhehicle(int p, int f, int m){
		passenger = p;
		fuelcap = f;	
		mpg = m;
	}
	
	//Отобразить дальность поездки транспортного средства
	void range(){
		System.out.println("Даольность поездки - " + fuelcap * mpg + " миль.");
	}
	
	//Рассчитать обьём топлива, необходимого транспортному
	//средству для преодоления заданного расстояния
	double fuelneeded(int miles){
		return (double) miles / mpg;
	}
}

//В главном классе обьявляется обект класса Vhehicle
class VehConsDemo{
	public static void main(String args[]) {
		
		//Полностью сконструировать обьекты транспортных средств
		Vhehicle minivan = new Vhehicle(7, 16, 21);
		Vhehicle sportcar = new Vhehicle(2, 14, 12);
		
		double gallons;
		int dist = 252;
		
		gallons = minivan.fuelneeded(dist);
		
		System.out.println("Для преодоления " + dist + 
			" миль мини-фургону понадобится " + 
			gallons + " галлонов топлива");
		
		gallons = sportcar.fuelneeded(dist);
		
		System.out.println("Для преодоления " + dist + 
			" миль спортивному автомобилю понадобится " + 
			gallons + " галлонов топлива");
	}
}
