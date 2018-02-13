/*
	Использование поразрядной операции исключающего или
	Для шифрования и дешифрования сообщений
*/
	
class Encode{
		
	public static void main(String args[]) {
			
		String msg = "Это тестовое сообщение";
		String encmsg = "";
		String decmsg = "";
		int key = 88;
		
		System.out.print("Исходное сообщение: ");
		System.out.println(msg);
		
		//Зашифровать сообщение
		for(int i=0; i < msg.length(); i++)
			//Построение зашифрованной строчки сообщения
			encmsg += (char) (msg.charAt(i) ^ key);
			
		System.out.print("Зашифрованное сообщение: ");
		System.out.println(encmsg);
		
		//Дешифровать сообщение
		for(int i = 0; i < msg.length(); i++)
			//Построение дешифрованной строчки сообщения
			decmsg += (char) (encmsg.charAt(i) ^ key);
			
		System.out.print("Дешифрованное сообщение: ");
		System.out.println(decmsg);
	}
}