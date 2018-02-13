/*
	Некоротые операции над строками
*/
	
class StringOps{
		
	public static void main(String args[]) {
			
		//Различные способы обьявления строк
		String str1 = "Java - лидер интернета";
		String str2 = new String(str1);
		String str3 = "Строки в Java эффективны.";
		int result, idx;
		char ch;
		
		System.out.println("Длинна строки str1: " + str1.length());
		
		//Отобразить строку str1 посимвольно
		for(int i =0; i < str1.length(); i++)
			System.out.print(str1.charAt(i));
		System.out.println();
		
		if(str1.equals(str2))
			System.out.println("str1 эквивалентна str2");
		else
			System.out.println("str1 не эквивалентна str2");
		
		if(str2.equals(str3))
			System.out.println("str2 эквивалентна str3");
		else
			System.out.println("str2 не эквивалентна str3");
		
		result = str1.compareTo(str3);
		
		if(result == 0)
			System.out.println("str1 и str3 равны");
		else if(result < 0)
			System.out.println("str1 меньше str3");
		else
			System.out.println("str1 больше str3");
		
		//Присвоить переменной str2 новую строку
		str2 = "One Два Три Четыре";
		
		idx = str2.indexOf("One");
		System.out.println("Индекс первого вложения Два: " + idx);
		idx = str2.lastIndexOf("One");
		System.out.println("Индекс последнего вложения Два: " + idx);
	}
}