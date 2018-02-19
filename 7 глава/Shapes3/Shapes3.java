/*
	Добавление конструкторов в класс Triangle
*/

//Класс описывающий двумерные обьекты
class TwoDShapes{
	private double wdth;	//теперь эти переменные
	private double heigth;	//объявленны как закрытые
	
	//Методы доступа к закрытым переменные класса
	double getWidth(){return wdth;}
	double getHeight(){return heigth;}
	void setWidth(double w){wdth = w;}
	void setHeight(double h){heigth = h;}
	
	void showDim(){
		System.out.println("Ширина и высота - " + 
			wdth + " и " + heigth);
	}
}

//Подкласс для представления треугольниковы,
//Производный от класса TwoDShapes
class Triangle extends TwoDShapes{
	String style;
	
	//Конструктор
	Triangle(String s, double w, double h){
		setHeight(w);
		setWidth(h);
		style = s;
	}
	
	double area(){
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle(){
		System.out.println("Треугольник " + style);
	}
}
	
class Shapes3{
	
	public static void main(String args[]) {
		Triangle t1 = new Triangle("закрашенный", 4.0, 4.0);
		Triangle t2 = new Triangle("контурный", 8.0, 12.0);
		
		System.out.println("Информация о t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Площадь - " + t1.area());
		System.out.println();
		
		System.out.println("Информация о t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Площадь - " + t2.area());
		System.out.println();
		
		
		
	}
}