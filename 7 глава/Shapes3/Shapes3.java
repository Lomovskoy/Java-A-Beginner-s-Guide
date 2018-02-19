/*
	���������� ������������� � ����� Triangle
*/

//����� ����������� ��������� �������
class TwoDShapes{
	private double wdth;	//������ ��� ����������
	private double heigth;	//���������� ��� ��������
	
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
	
	//�����������
	Triangle(String s, double w, double h){
		setHeight(w);
		setWidth(h);
		style = s;
	}
	
	double area(){
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle(){
		System.out.println("����������� " + style);
	}
}
	
class Shapes3{
	
	public static void main(String args[]) {
		Triangle t1 = new Triangle("�����������", 4.0, 4.0);
		Triangle t2 = new Triangle("���������", 8.0, 12.0);
		
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