/*
	Упражнение 5.2
	Класс, реализующий очередь для хранения символов
*/
	
class Queue{
	char q[];			//Массив для хранения элементов очереди
	int putloc, getloc;	//индексы для вставки и извлечения элементов очереди
	
	Queue(int size){
		q = new char[size + 1];//Выделить память для очереди
		putloc = getloc = 0;
	}
	
	//Поместить символ в очередь
	void put(char ch){
		if(putloc == q.length - 1){
			System.out.println(" - Очередь заполнена");
			return;
		}
		putloc++;
		q[putloc] = ch;
	}
	
	//Извлеч символ из очереди
	char get(){
		if(getloc == putloc){
			System.out.println(" - Очередь пуста");
			return (char) 0;
		}
		getloc++;
		return q[getloc];
	}
}	
	
//Демонстрация пользователя класса Queue
class QDemo{
		
	public static void main(String args[]) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;
		
		System.out.println("Использование очереди bigQ для сохранения алфавита");
		//Поместить буквенные символы в очередь bigQ
		for(i=0; i < 26; i++)
			bigQ.put((char) ('A' + i));
		
		//Извречь буквенные символы в очередь bigQ
		System.out.println("Содержимое очереди bigQ: ");
		for(i=0; i < 26; i++){
			ch = bigQ.get();
			if(ch != (char) 0) System.out.print(ch);
		}
		
		System.out.println("\n");
		
		System.out.println("Использование очереди smallQ для ганерации ошибок");
		//Использовать очереди smallQ для ганерации ошибок
		for(i=0; i < 5; i++){
			System.out.print("Попытка сохранения " + (char)('Z' - i));
			smallQ.put((char)('Z' - i));
			System.out.println();
		}
		System.out.println();
		
		//Добавление ошибки при обращении к очереди smallQ
		System.out.print("Содержание smallQ: ");
		for(i=0; i < 5; i++){
			ch = smallQ.get();
			if(ch != (char) 0) System.out.print(ch);
		}
	}
}