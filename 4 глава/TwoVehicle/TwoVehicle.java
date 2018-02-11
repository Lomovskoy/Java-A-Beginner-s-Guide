/*
	Программа в которой создаётся 2 обьекта класса Vhehicle
	
*/
class Vhehicle{
	int passenger;	//колисчество пассажиров
	int fuelcap;	//ёмкость топливного бака
	int mpg;		//потрибление топливо в милях на галлон
}

//В главном классе обьявляется обект класса Vhehicle
class TwoVehicle{
	public static void main(String args[]) {
		//Эти 2 переменнве ссылаются на разные обьекты
		Vhehicle minivan = new Vhehicle();
		Vhehicle sportcar = new Vhehicle();
		
		int range1, range2;
		
		//Присвоить значения полям класса minivan
		minivan.passenger = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		//Присвоить значения полям класса sportcar
		sportcar.passenger = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;
		
		//Расчёт дальности поездки при полном баке
		range1 = minivan.fuelcap * minivan.mpg;
		range2 = sportcar.fuelcap * sportcar.mpg;
		
		System.out.println("Мини-фургон может перевезти " + 
			minivan.passenger + " пассажиров на расстояние " + 
			range1 + " миль.");
		System.out.println("Cпортивный автомобить может перевезти " + 
			sportcar.passenger + " пассажиров на расстояние " + 
			range2 + " миль.");
	}
}
