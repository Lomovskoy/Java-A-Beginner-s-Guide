/*
	Создайте метод sum который будет принимать массив 
	переменной длинны, и возвращать сумму
	
*/

class SumDemo{
	
	static int sum(int ... x){
		
		int result = 0;
		
		for(int y : x)
			result += y;
		
		return result;
	}
		
	public static void main(String args[]) {
		
		System.out.println(SumDemo.sum(1));
		System.out.println(SumDemo.sum(2,0));
		System.out.println(SumDemo.sum(0,1,2));
		System.out.println(SumDemo.sum());
		System.out.println(SumDemo.sum(2,4,8,16));
		System.out.println(SumDemo.sum(8,10));
		
		
	}
}