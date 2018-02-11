/*
	Использование возвращаемого значения
	
*/
class Vhehicle{
	int passenger;	//колисчество пассажиров
	int fuelcap;	//ёмкость топливного бака
	int mpg;		//потрибление топливо в милях на галлон
	
	//Возвырат дальности поездки
	int range(){
		return mpg * fuelcap;
	}
}

//В главном классе обьявляется обект класса Vhehicle
class RetMeth{
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
		
		//Получение дальности поездки при полном баке
		range1 = minivan.range();
		range2 = sportcar.range();
		
		System.out.println("Мини-фургон может перевезти " + 
			minivan.passenger + " пассажиров на расстояние " + 
			range1 + " миль.");
		System.out.println("Cпортивный автомобить может перевезти " + 
			sportcar.passenger + " пассажиров на расстояние " + 
			range2 + " миль.");
	}
}
