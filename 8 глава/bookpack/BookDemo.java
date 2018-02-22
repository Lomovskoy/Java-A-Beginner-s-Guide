/*
	������� ��������� ��������������� ���������� �������
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
		
		books[0] = new Book("Java: ����������� ��� ����������", "�����", 2015);
		books[1] = new Book("Java: ������ �����������", "�����", 2015);
		books[2] = new Book("Java: ��������� ����������������", "����� � �����", 2003);
		books[3] = new Book("Java: ��������� � ��������� ������", "�������", 2013);
		books[4] = new Book("Java: ����������� ����������������", "����", 2014);
		
		for(int i=0; i < books.length; i++)
			books[i].show();
	}
}