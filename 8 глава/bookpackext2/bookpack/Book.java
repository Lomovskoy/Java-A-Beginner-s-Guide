/*
	Обьявляем защищёнными переменных экземпляра класса Book
*/
package bookpackext2.bookpack;

public class Book{
	protected String title;
	protected String autor;
	protected int pubDate;
	
	//Теперь конструктор стал открытым
	public Book(String title, String autor, int pubDate){
		this.title = title;
		this.autor = autor;
		this.pubDate = pubDate;
	}
	
	//Теперь метод стал открытым
	public void show(){
		System.out.println(title);
		System.out.println(autor);
		System.out.println(pubDate);
		System.out.println();
	}
}