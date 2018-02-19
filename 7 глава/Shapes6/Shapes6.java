/*
	�������������� ��������
*/

//����� ����������� ��������� �������
class TwoDShapes{
	private double wdth;	//������ ��� ����������
	private double heigth;	//���������� ��� ��������
	
	//����������� �� ���������
	TwoDShapes(){
		wdth = heigth = 0;
	}
	
	//�����������
	TwoDShapes(double w, double h){
		setHeight(w);
		setWidth(h);
	}
	
	//����������� � ����������� ����������
	//���������� ���������� wdth � heigth
	TwoDShapes(double w){
		wdth = heigth = w;
	}
	
	
	//������ ������� � �������� ���������� ������
	double getWidth(){return wdth;}
	double getHeight(){return heigth;}
	void setWidth(double w){wdth = w;}
	void setHeight(double h){heigth = h;}
	
	void showDim(){
		System.out.println("������ � ������ - " + 
			wdth + " � " + heigth);
	}
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
		super(w, h);//����������� ����������� � 2�� �����������
		style = s;
	}
	
	//����������� � ����� ����������
	Triangle(double x){
		super(x);
		style = "�����������";
	}
	
	double area(){
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle(){
		System.out.println("����������� " + style);
	}
}

//���������� ������ Triangle
class ColorTriangle extends Triangle{
	
	private String color;
	
	ColorTriangle(String c, String s, double w, double h){
		super(s, w, h);
		color = c;
	}
	
	String getColor(){return color;}
	
	void showColor(){
		System.out.println("���� - " + color);
	}
}
	
class Shapes6{
	
	public static void main(String args[]) {
		ColorTriangle t1 = 
			new ColorTriangle("�����", "���������", 8.0, 12.0);
		ColorTriangle t2 = 
			new ColorTriangle("�������", "�����������", 2.0, 2.0);
		
		System.out.println("���������� � t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("������� - " + t1.area());
		System.out.println();
		
		System.out.println("���������� � t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("������� - " + t2.area());
		System.out.println();
		
	}
}