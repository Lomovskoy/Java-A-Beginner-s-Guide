/*
	Добавление метода range() в класс Vehicle
	
*/
class Vhehicle{
	int passenger;	//колисчество пассажиров
	int fuelcap;	//ёмкость топливного бака
	int mpg;		//потрибление топливо в милях на галлон
	
	//Отобразить дальность поездки транспортного средства
	void range(){
		System.out.println("Даольность поездки - " + fuelcap * mpg + " миль.");
	}
}

//В главном классе обьявляется обект класса Vhehicle
class AddMeth{
	public static void main(String args[]) {
		//Эти 2 переменнве ссылаются на разные обьекты
		Vhehicle minivan = new Vhehicle();
		Vhehicle sportcar = new Vhehicle();
		
		//Присвоить значения полям класса minivan
		minivan.passenger = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		//Присвоить значения полям класса sportcar
		sportcar.passenger = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;
		
		System.out.println("Мини-фургон может перевезти " + 
			minivan.passenger + " пассажиров");
		minivan.range();//Дальность поездки мини фургона
			
		System.out.println("Cпортивный автомобить может перевезти " + 
			sportcar.passenger + " пассажиров");
		sportcar.range();//Дальность поездки спортивного автомобиля
	}
}
