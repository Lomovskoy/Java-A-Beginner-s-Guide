/*
	����� ���������� ��� ��������� �������
*/
package bookpackext.bookpack;

public class Book{
	private String title;
	private String autor;
	private int pubDate;
	
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