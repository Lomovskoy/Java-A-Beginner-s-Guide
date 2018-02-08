/*
	Расчёт числа кубических дюймов в кубе объёмом в 1 куб. милю
*/

class Inches{
	public static void main(String args[]){
		long ci;
		long im;
		
		im = 5280 * 12;
		ci = im * im * im;
		System.out.println("В одной кубической миле содержится " + ci + 
			" кубических дюймов");
	}
}