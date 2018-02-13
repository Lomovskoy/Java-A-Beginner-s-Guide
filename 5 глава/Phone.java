/*
	Простейший автоматизированный телефонный справочник
*/
	
class Phone{
		
	public static void main(String args[]) {
			
		String numbers[][] = {
			{"Том", "555-55-55"},
			{"Мария", "222-22-22"},
			{"Джон", "666-66-66"},
			{"Рашель", "889-25-55"}
		};
		int i;
		
		//Для того, что бывоспользоваться программой,
		//ей нужно передать один аргумент командной строки
		if(args.length != 1)
			System.out.println("Использование: Java Phone <имя>");
		else{
			for(i=0; i<numbers.length; i++){
				if(numbers[i][0].equals(args[0])){
					System.out.println(numbers[i][0]+" : "+numbers[i][1]);
					break;
				}
			}
			if(i == numbers.length)
				System.out.println("Имя не найденно");
		}
		
	}
}