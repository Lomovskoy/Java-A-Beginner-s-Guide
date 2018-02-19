/*
	Многоуровневая иерархия
*/

//Класс описывающий двумерные обьекты
class TwoDShapes{
	private double wdth;	//теперь эти переменные
	private double heigth;	//объявленны как закрытые
	
	//Конструктор по умолчанию
	TwoDShapes(){
		wdth = heigth = 0;
	}
	
	//Конструктор
	TwoDShapes(double w, double h){
		setHeight(w);
		setWidth(h);
	}
	
	//Конструктор с одинаковыми значениями
	//переменных экземпляра wdth и heigth
	TwoDShapes(double w){
		wdth = heigth = w;
	}
	
	
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
	
	//Конструктор по умолчанию
	Triangle(){
		super();//Вызвать конструктор суперкласса по умолчанию
		style = "none";
	}
	
	//Конструктор
	Triangle(String s, double w, double h){
		super(w, h);//Конструктор суперкласса с 2мя параметрами
		style = s;
	}
	
	//Конструктор с одним переметром
	Triangle(double x){
		super(x);
		style = "закрашенный";
	}
	
	double area(){
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle(){
		System.out.println("Треугольник " + style);
	}
}

//Расширение класса Triangle
class ColorTriangle extends Triangle{
	
	private String color;
	
	ColorTriangle(String c, String s, double w, double h){
		super(s, w, h);
		color = c;
	}
	
	String getColor(){return color;}
	
	void showColor(){
		System.out.println("Цвет - " + color);
	}
}
	
class Shapes6{
	
	public static void main(String args[]) {
		ColorTriangle t1 = 
			new ColorTriangle("Синий", "контурный", 8.0, 12.0);
		ColorTriangle t2 = 
			new ColorTriangle("Красный", "закрашенный", 2.0, 2.0);
		
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