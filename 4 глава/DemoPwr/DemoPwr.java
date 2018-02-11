/*
	Программа для вычисления целочисленных степений числа
*/

class Pwr{
	
	double b;
	int e;
	double val;
	
	Pwr(double base, int exp){
		//Сдлово this не использувается 
		//так как оно подразумечается автоматически
		this.b = base;
		this.e = exp;
		this.val = 1;
		
		if(exp == 0) return;
		for(; exp>0; exp--) val *= base; 
	}
	double get_pwr(){
		return val;
	}
}
	
class DemoPwr{
		
	public static void main(String args[]) {
			
		Pwr x = new Pwr(4.0, 2);
		Pwr y = new Pwr(2.5, 1);
		Pwr z = new Pwr(5.7, 0);
			
		System.out.println(x.b + " в степени " + x.e + " = " + x.get_pwr());
		System.out.println(y.b + " в степени " + y.e + " = " + y.get_pwr());
		System.out.println(z.b + " в степени " + z.e + " = " + z.get_pwr());
	}
}