/*
	Применение ключевого слова final к переменным экземпляра
*/

//Возврат обьекта типа String
class ErrorMsg{
	//Коды ошибок
	//Константы обьявляются с помощью ключевого слова final
	final int OUTERR = 0;
	final int INERR = 1;
	final int DISKERR = 2;
	final int INDEXERR = 3;
	
	String msgs[] = {
		"Ошибка вывода",
		"Ошибка ввода",
		"Отсутствует место на диске",
		"Выход индекса за границы диапазона"
	};
	
	//Возвратить сообщение об ошибке
	String getErrorMsg(int i){
		if(i >= 0 & i < msgs.length)
			return msgs[i];
		else
			return "Несуществующий код ошибки";

	}
}

class FinalD{
	
	public static void main(String args[]) {
		
		ErrorMsg err = new ErrorMsg();
		
		//При вызове метода используются константы,
		//обьявленный с помошью ключевого слова final
		System.out.println(err.getErrorMsg(err.OUTERR));
		System.out.println(err.getErrorMsg(err.DISKERR));
	}
}