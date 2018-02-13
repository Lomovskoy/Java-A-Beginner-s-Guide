/*
	Знакомство с классом String
*/
	
class StringDemo{
		
	public static void main(String args[]) {
			
		//Различные способы обьявления строк
		String str1 = new String("В Java строки - обьекты.");
		String str2 = "Их можно смоздавать разными способами.";
		String str3 = new String(str2);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}