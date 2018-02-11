/*
	Добавление параметризитованного метода в котором происходит
	расчёт обьёма топлива, необходимого транспортному средству для
	преодоления заданного расстояния.
*/
class Vhehicle{
	int passenger;	//колисчество пассажиров
	int fuelcap;	//ёмкость топливного бака
	int mpg;		//потрибление топливо в милях на галлон
	
	//Определить дальность поездки транспортного средства
	int range(){
		return mpg * fuelcap;
	}
	
	//Рассчитать обьём топлива, необходимого транспортному
	//средству для преодоления заданного расстояния
	double fuelneeded(int miles){
		return (double) miles / mpg;
	}
}

//В главном классе обьявляется обект класса Vhehicle
class CompFuel{
	public static void main(String args[]) {
		//Эти 2 переменнве ссылаются на разные обьекты
		Vhehicle minivan = new Vhehicle();
		Vhehicle sportcar = new Vhehicle();
		
		double gallons;
		int dist = 252;
		
		//Присвоить значения полям класса minivan
		minivan.passenger = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		//Присвоить значения полям класса sportcar
		sportcar.passenger = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;
		
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

