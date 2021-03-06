/*
	�������������� ������� ������� ��� ��������� � 
	��������� �������� �������� ������
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
	
	double area(){
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle(){
		System.out.println("����������� " + style);
	}
}
	
class Shapes2{
	
	public static void main(String args[]) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		t1.setWidth(4.0);
		t1.setHeight(4.0);
		t1.style = "�����������";
		
		t2.setWidth(8.0);
		t2.setHeight(12.0);
		t2.style = "���������";
		
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