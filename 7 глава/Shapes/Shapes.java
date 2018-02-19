/*
	������� �������� �������
*/

//����� ����������� ��������� �������
class TwoDShapes{
	double wdth;
	double heigth;
	
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
		return wdth * heigth / 2;
	}
	
	void showStyle(){
		System.out.println("����������� " + style);
	}
}
	
class Shapes{
	
	public static void main(String args[]) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		t1.wdth = 4.0;
		t1.heigth = 4.0;
		t1.style = "�����������";
		
		t2.wdth = 8.0;
		t2.heigth = 12.0;
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