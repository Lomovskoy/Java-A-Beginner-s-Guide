/*
	Использование аьстрактных методов
*/

//Создание адстрактного класса
abstract class TwoDShapes{
	private double wdth;	//теперь эти переменные
	private double heigth;	//объявленны как закрытые
	private String name;
	
	//Конструктор по умолчанию
	TwoDShapes(){
		wdth = heigth = 0;
		name = "none";
	}
	
	//Конструктор с параметрами
	TwoDShapes(double w, double h, String n){
		setHeight(w);
		setWidth(h);
		name = n;
	}
	
	//Конструктор с одинаковыми значениями
	//переменных экземпляра wdth и heigth
	TwoDShapes(double w, String n){
		wdth = heigth = w;
		name = n;
	}
	
	//Создать один обьект на основе другого
	TwoDShapes(TwoDShapes ob){
		wdth = ob.wdth;
		heigth = ob.heigth;
		name = ob.name;
	}
	
	//Методы доступа к закрытым переменные класса
	double getWidth(){return wdth;}
	double getHeight(){return heigth;}
	void setWidth(double w){wdth = w;}
	void setHeight(double h){heigth = h;}
	String getName(){return name;}
	
	void showDim(){
		System.out.println("Ширина и высота - " + 
			wdth + " и " + heigth);
	}
	
	//Метод area() абстрактный
	abstract double area();
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
		super(w, h, "треугольник");//Конструктор суперкласса с 2мя параметрами
		style = s;
	}
	
	//Конструктор с одним переметром
	Triangle(double x){
		super(x, "треугольник");
		style = "закрашенный";
	}
	
	//Создать один обьект на основе другого
	Triangle(Triangle ob){
		super(ob);
		style = ob.style;
	}
	
	//Переопределение метода area() для класса Triangle
	double area(){
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle(){
		System.out.println("Треугольник " + style);
	}
}
	
//Подкласс для представления прямоугольников	
//производный от класса TwoDShapes
class Rectangle extends TwoDShapes{
	
	//Конструктор по умолчанию
	Rectangle(){
		super();
	}
	
	//Конструктор класса Rectangle
	Rectangle(double w, double h){
		super(w, h, "прямоугольник");
	}
	
	//Создать квадрат
	Rectangle(double x){
		super(x, "прямоугольник");
	}
	
	//Создать один обьект на основе другого
	Rectangle(Rectangle ob){
		super(ob);
	}
	
	boolean isSquare(){
		if(getWidth() == getHeight()) return true;
		return false;
	}
	
	//Переопределение метода area() для класса Rectangle
	double area(){
		return getWidth() * getHeight();
	}
}

class AbsShape{
	
	public static void main(String args[]) {
		
		TwoDShapes shapes[] = new TwoDShapes[4];
		
		shapes[0] = new Triangle("контурный", 8.0, 12.0);
		shapes[1] = new Rectangle(10);
		shapes[2] = new Rectangle(10,4);
		shapes[3] = new Triangle(7.0);
		
		for(int i=0; i < shapes.length; i++){
			System.out.println("Объект - " + shapes[i].getName());
			//Благодаля полиморфизму - нужная версия метода area() 
			//вызывается для каждой геометрической фигуры 
			//по отдельности
			System.out.println("Площадь - " + shapes[i].area());
			System.out.println();
		}
	}
}