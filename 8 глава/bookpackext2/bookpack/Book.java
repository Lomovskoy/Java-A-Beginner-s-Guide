/*
	��������� ����������� ���������� ���������� ������ Book
*/
package bookpackext2.bookpack;

public class Book{
	protected String title;
	protected String autor;
	protected int pubDate;
	
	//������ ����������� ���� ��������
	public Book(String title, String autor, int pubDate){
		this.title = title;
		this.autor = autor;
		this.pubDate = pubDate;
	}
	
	//������ ����� ���� ��������
	public void show(){
		System.out.println(title);
		System.out.println(autor);
		System.out.println(pubDate);
		System.out.println();
	}
}