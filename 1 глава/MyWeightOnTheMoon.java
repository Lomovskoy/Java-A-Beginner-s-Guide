/*
	Упражнение 1.1
	
	Программа перевода галлоновв литры
	
	Присвойте файлу с исходным кодом имя MyWeightOnTheMoon.java
*/
class MyWeightOnTheMoon{
	public static void main(String args[]){
		double myWeight;		//Мой вес
		double weightOnTheMoon;	//Мой вес на луне
		
		myWeight = 78.6;	
		
		weightOnTheMoon = myWeight * 0.17; //перевестив литры
		
		System.out.println("Мой вес на луне = " + weightOnTheMoon);
	}
}