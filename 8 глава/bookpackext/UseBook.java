/*
	КЉласс принадлежит пакету bookpackext
*/
package bookpackext;

public class UseBook{
	
	public static void main(String args[]) {
		//Перед именем используемого класса используется имя его пакета
		bookpackext.bookpack.Book books[] = new bookpackext.bookpack.Book[5];
		
		books[0] = new bookpackext.bookpack.Book(
			"Java: Руководство для начинающих", "Шилдт", 2015);
		books[1] = new bookpackext.bookpack.Book(
			"Java: Полное руководство", "Шилдт", 2015);
		books[2] = new bookpackext.bookpack.Book(
			"Java: Искусство программирования", "Шилдт и Холмс", 2003);
		books[3] = new bookpackext.bookpack.Book(
			"Java: Алгоритмы и структуры данных", "Лафорте", 2013);
		books[4] = new bookpackext.bookpack.Book(
			"Java: Эффективное программирование", "Блох", 2014);
		
		for(int i=0; i < books.length; i++)
			books[i].show();
	}
}