/*
	Класс, реализующий очередь для хранения символов
*/
	
class Queue{
	// Эти члены класса теперь являются закрытыми
	private char q[]; 			// массив для хранения элементов очереди
	private int putloc, getloc; // индексы для вставки и извлечения элементов очереди
	
	// Конструктор, создающий один объект типа Queue
	// на основе другого
	Queue(Queue ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];
		
		// Копировать элементы очереди
		for(int i = getloc + 1; i <= putloc; i++)
			q[i] = ob.q[i];
	}
	
	// Конструирование и инициализация объекта типа Queue
	Queue (char a[]) {
		putloc = 0;
		getloc = 0;
		q = new char[a.length+1];
		
		for(int i = 0; i < a.length; i++) 
			put(a[i]);
	}

	// Сконструировать пустую очередь заданного размера
	Queue (int size) {
		q = new char[size+1];	// выделить память для очереди
		putloc = getloc = 0;
	}
	
	// Поместить символ в очередь
	void put(char ch) {
		if(putloc == q.length-1){
			System.out.println(" - Очередь заполнена.");
			return;
		}
		
		putloc++;
		q[putloc] = ch;
	}
	
	// Извлечь символ из очереди
	char get(){
		if (getloc == putloc) {
			System.out.println(" - Очередь пуста.");
			return (char) 0;
		}
		getloc++;
		return q[getloc];
	}
}	
	
//Демонстрация пользователя класса Queue
class QDemo3{
		
	public static void main(String args[]) {
		
		// Создать пустую очередь для хранения 10 элементов
		Queue ql = new Queue(10);
		char name[] = {'Т', 'o', 'm'};
		
		// Создать очередь на основе массива
		Queue q2 = new Queue(name);
		char ch;
		int i;
		
		// Поместить ряд символов в очередь ql
		for(i=0; i < 10; i++)
			ql.put ((char) ('А' + i));
	
		// Создать одну очередь на основе другой
		Queue qЗ = new Queue(ql);
		
		// Показать очереди
		System.out.print("Coдepжимoe ql: ");
		
		for (i=0; i < 10; i++) {
			ch = ql.get();
			System.out.print(ch);
		}
		System.out.println("\n");
		
		System.out.print("Coдepжимoe q2: ");
		for (i=0; i < 3; i++) {
			ch = q2.get();
			System.out.print(ch);
		}
		System.out.println("\n");
		
		System.out.print("Coдepжимoe qЗ: ");
		for (i=0; i < 10; i++) {
			ch = qЗ.get();
			System.out.print(ch);
		}

	}
}