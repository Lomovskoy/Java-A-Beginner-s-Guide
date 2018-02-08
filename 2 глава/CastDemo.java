/*
	Демонстрацияавтоматического преобразования типов
*/

class CastDemo{
	public static void main(String args[]){
		double x, y;
		byte b;
		int i;
		char ch;
		
		x = 10.0;
		y = 3.0;
		i = (int)(x / y);//привести тип double к типу int		
		System.out.println("Целочесленный результтат деления x / y: " + i);
		
		i = 100;
		b = (byte) i;//byte может содержать 100
		System.out.println("Значение b: " + b);
		
		i = 275;
		b = (byte) i;//byte не может содержать 100
		System.out.println("Значение b: " + b);
		
		b = 88;
		ch = (char) b;//byte может содержит хзначение Х
		System.out.println("Значение ch: " + ch);
	}
	
}