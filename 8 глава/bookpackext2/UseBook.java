/*
	КЉласс принадлежит пакету bookpackext
*/
package bookpackext2;

//Пример использования модификатора protected
class ExtBook extends bookpackext2.bookpack.Book{
	private String publisher;
	
	public ExtBook(String t, String a, int d, String p){
		
		super(t, a, d);
		publisher = p;
	}
	
	public void show(){
		super.show();
		System.out.println(publisher);
		System.out.println();
	}
	
	public String getPublisher(){return publisher;}
	public void setPublisher(String p){publisher = p;}
	
	//Следующие операторы допустимы, поскольку подклассы имеют
	//право доступа к членам класса, обьявленным защищёнными
	public String gerTitle(){return title;}
	public void setTitile(String t){title = t;}
	public String getAutor(){return autor;}
	public void setAutor(String a){autor = a;}
	public int getPubDate(){return pubDate;}
	public void setPubDate(int d){pubDate = d;}
	
}



public class UseBook{
	
	public static void main(String args[]) {
		//Перед именем используемого класса используется имя его пакета
		ExtBook books[] = new ExtBook[5];
		
		books[0] = new ExtBook(
			"Java: Руководство для начинающих", "Шилдт", 2015, "Публикатор");
		books[1] = new ExtBook(
			"Java: Полное руководство", "Шилдт", 2015, "Публикатор");
		books[2] = new ExtBook(
			"Java: Искусство программирования", "Шилдт и Холмс", 2003, "Публикатор");
		books[3] = new ExtBook(
			"Java: Алгоритмы и структуры данных", "Лафорте", 2013, "Публикатор");
		books[4] = new ExtBook(
			"Java: Эффективное программирование", "Блох", 2014, "Публикатор");
		
		for(int i=0; i < books.length; i++)
			books[i].show();
		
		//Поиск книг по автору
		System.out.println("Поиск книг по автору: Шилд");
		for(int i=0; i < books.length; i++)
			if(books[i].getAutor()=="Шилдт")
				System.out.println(books[i].gerTitle());
			
		//books[0].title = "Тестовый титульник"; // Ошибка доступа
	}
}