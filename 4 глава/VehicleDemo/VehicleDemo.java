/*
	Программа в которой используется класс Vhehicle
	
*/
class Vhehicle{
	int passenger;	//колисчество пассажиров
	int fuelcap;	//ёмкость топливного бака
	int mpg;		//потрибление топливо в милях на галлон
}

//В главном классе обьявляется обект класса Vhehicle
class VehicleDemo{
	public static void main(String args[]) {
		Vhehicle minivan = new Vhehicle();
		int range;
		
		//Присвоить значения полям класса minivan
		minivan.passenger = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		//Расчёт дальности поездки при полном баке
		range = minivan.fuelcap * minivan.mpg;
		System.out.println("Мини-фургон может перевезти " + 
			minivan.passenger + " пассажиров на расстояние " + 
			range + " миль.");
	}
}
