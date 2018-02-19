/*
	������������� ����������� �������
*/

//�������� ������������ ������
abstract class TwoDShapes{
	private double wdth;	//������ ��� ����������
	private double heigth;	//���������� ��� ��������
	private String name;
	
	//����������� �� ���������
	TwoDShapes(){
		wdth = heigth = 0;
		name = "none";
	}
	
	//����������� � �����������
	TwoDShapes(double w, double h, String n){
		setHeight(w);
		setWidth(h);
		name = n;
	}
	
	//����������� � ����������� ����������
	//���������� ���������� wdth � heigth
	TwoDShapes(double w, String n){
		wdth = heigth = w;
		name = n;
	}
	
	//������� ���� ������ �� ������ �������
	TwoDShapes(TwoDShapes ob){
		wdth = ob.wdth;
		heigth = ob.heigth;
		name = ob.name;
	}
	
	//������ ������� � �������� ���������� ������
	double getWidth(){return wdth;}
	double getHeight(){return heigth;}
	void setWidth(double w){wdth = w;}
	void setHeight(double h){heigth = h;}
	String getName(){return name;}
	
	void showDim(){
		System.out.println("������ � ������ - " + 
			wdth + " � " + heigth);
	}
	
	//����� area() �����������
	abstract double area();
}

//�������� ��� ������������� ��������������,
//����������� �� ������ TwoDShapes
class Triangle extends TwoDShapes{
	String style;
	
	//����������� �� ���������
	Triangle(){
		super();//������� ����������� ����������� �� ���������
		style = "none";
	}
	
	//�����������
	Triangle(String s, double w, double h){
		super(w, h, "�����������");//����������� ����������� � 2�� �����������
		style = s;
	}
	
	//����������� � ����� ����������
	Triangle(double x){
		super(x, "�����������");
		style = "�����������";
	}
	
	//������� ���� ������ �� ������ �������
	Triangle(Triangle ob){
		super(ob);
		style = ob.style;
	}
	
	//��������������� ������ area() ��� ������ Triangle
	double area(){
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle(){
		System.out.println("����������� " + style);
	}
}
	
//�������� ��� ������������� ���������������	
//����������� �� ������ TwoDShapes
class Rectangle extends TwoDShapes{
	
	//����������� �� ���������
	Rectangle(){
		super();
	}
	
	//����������� ������ Rectangle
	Rectangle(double w, double h){
		super(w, h, "�������������");
	}
	
	//������� �������
	Rectangle(double x){
		super(x, "�������������");
	}
	
	//������� ���� ������ �� ������ �������
	Rectangle(Rectangle ob){
		super(ob);
	}
	
	boolean isSquare(){
		if(getWidth() == getHeight()) return true;
		return false;
	}
	
	//��������������� ������ area() ��� ������ Rectangle
	double area(){
		return getWidth() * getHeight();
	}
}

class AbsShape{
	
	public static void main(String args[]) {
		
		TwoDShapes shapes[] = new TwoDShapes[4];
		
		shapes[0] = new Triangle("���������", 8.0, 12.0);
		shapes[1] = new Rectangle(10);
		shapes[2] = new Rectangle(10,4);
		shapes[3] = new Triangle(7.0);
		
		for(int i=0; i < shapes.length; i++){
			System.out.println("������ - " + shapes[i].getName());
			//��������� ������������ - ������ ������ ������ area() 
			//���������� ��� ������ �������������� ������ 
			//�� �����������
			System.out.println("������� - " + shapes[i].area());
			System.out.println();
		}
	}
}