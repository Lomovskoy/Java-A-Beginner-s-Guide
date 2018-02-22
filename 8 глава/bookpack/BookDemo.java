/*
	Простая программа демонстрирующая применение пакетов
*/
package bookpack;

class Book{
	private String title;
	private String autor;
	private int pubDate;
	
	Book(String title, String autor, int pubDate){
		this.title = title;
		this.autor = autor;
		this.pubDate = pubDate;
	}
	
	void show(){
		System.out.println(title);
		System.out.println(autor);
		System.out.println(pubDate);
		System.out.println();
	}
}

class BookDemo{
	
	public static void main(String args[]) {
		Book books[] = new Book[5];
		
		books[0] = new Book("Java: Руководство для начинающих", "Шилдт", 2015);
		books[1] = new Book("Java: Полное руководство", "Шилдт", 2015);
		books[2] = new Book("Java: Искусство программирования", "Шилдт и Холмс", 2003);
		books[3] = new Book("Java: Алгоритмы и структуры данных", "Лафорте", 2013);
		books[4] = new Book("Java: Эффективное программирование", "Блох", 2014);
		
		for(int i=0; i < books.length; i++)
			books[i].show();
	}
}