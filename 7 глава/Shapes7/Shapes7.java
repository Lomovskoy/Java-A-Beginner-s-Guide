/*
	Создание одного обьекта на основе другого
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
	
	//Создать один обьект на основе другого
	TwoDShapes(TwoDShapes ob){
		wdth = ob.wdth;
		heigth = ob.heigth;
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
	
	//Создать один обьект на основе другого
	Triangle(Triangle ob){
		super(ob);
		style = ob.style;
	}
	
	double area(){
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle(){
		System.out.println("Треугольник " + style);
	}
}
	
class Shapes7{
	
	public static void main(String args[]) {
		Triangle t1 = 
			new Triangle("контурный", 8.0, 12.0);
			
		//создаём копию обьекта
		Triangle t2 = new Triangle(t1);
		
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