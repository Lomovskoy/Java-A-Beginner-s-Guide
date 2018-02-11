/*
	Упражнение 4.2
	Демонстрация сборки мусора и метода finalize
*/
class FDemo{
	
	int x;
	
	FDemo(int i){
		x = i;
	}
	
	//Вызывается при удалении обьекта
	protected void finalize(){
		System.out.println("Сборщик мусора удалил объект: " + x);
	}
	
	//Генерирует обьект который тот час же уничтожается
	void generator(int i){
		FDemo o = new FDemo(i);
	}
}

class Finalize{
	
	public static void main(String args[]) {
		
		FDemo ob = new FDemo(0);
		
		/*	Генерируется большое количество обьектов.
			в какой то ммоент должна начаться сборка мусора.
			Примечание: возможно, для активации сборки мусора
			количество генерируемыхэ объектов нужно увеличить
		*/
		for(int count = 0; count < 10000000; count++){
			ob.generator(count);
		}
	}
}

