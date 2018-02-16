/*
	Класс, реализующий стек для хранения символов
*/
	
class Stack{
	char q[];			//Массив для хранения элементов стека
	int putloc, getloc;	//индексы для вставки и извлечения элементов стека
	
	Stack(int size){
		q = new char[size + 1];//Выделить память для стека
		putloc = getloc = 0;
	}
	
	//Поместить символ в стек
	void put(char ch){
		if(putloc == q.length - 1){
			System.out.println(" - стек заполнен");
			return;
		}
		putloc++;
		q[putloc] = ch;
	}
	
	//Извлеч символ из стека
	char get(){
		getloc = putloc;
		if(getloc == 0){
			System.out.println(" - стек пуст");
			return (char) 0;
		}
		putloc--;
		return q[getloc];
	}
}	
	
//Демонстрация пользователя класса Stack
class StackDemo{
		
	public static void main(String args[]) {
		Stack bigS = new Stack(100);
		Stack smallS = new Stack(4);
		char ch;
		int i;
		
		System.out.println("Использование стека bigS для сохранения алфавита");
		//Поместить буквенные символы в стек bigS
		for(i=0; i < 26; i++)
			bigS.put((char) ('A' + i));
		
		//Извречь буквенные символы в стек bigS
		System.out.println("Содержимое стека bigS: ");
		for(i=0; i < 26; i++){
			ch = bigS.get();
			if(ch != (char) 0) System.out.print(ch);
		}
		
		System.out.println("\n");
		
		System.out.println("Использование стека smallS для ганерации ошибок");
		//Использовать стека smallS для ганерации ошибок
		for(i=0; i < 5; i++){
			System.out.print("Попытка сохранения " + (char)('Z' - i));
			smallS.put((char)('Z' - i));
			System.out.println();
		}
		System.out.println();
		
		//Добавление ошибки при обращении к очереди smallS
		System.out.print("Содержание smallS: ");
		for(i=0; i < 5; i++){
			ch = smallS.get();
			if(ch != (char) 0) System.out.print(ch);
		}
	}
}