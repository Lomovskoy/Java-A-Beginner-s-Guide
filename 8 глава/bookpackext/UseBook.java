/*
	ʊ���� ����������� ������ bookpackext
*/
package bookpackext;

public class UseBook{
	
	public static void main(String args[]) {
		//����� ������ ������������� ������ ������������ ��� ��� ������
		bookpackext.bookpack.Book books[] = new bookpackext.bookpack.Book[5];
		
		books[0] = new bookpackext.bookpack.Book(
			"Java: ����������� ��� ����������", "�����", 2015);
		books[1] = new bookpackext.bookpack.Book(
			"Java: ������ �����������", "�����", 2015);
		books[2] = new bookpackext.bookpack.Book(
			"Java: ��������� ����������������", "����� � �����", 2003);
		books[3] = new bookpackext.bookpack.Book(
			"Java: ��������� � ��������� ������", "�������", 2013);
		books[4] = new bookpackext.bookpack.Book(
			"Java: ����������� ����������������", "����", 2014);
		
		for(int i=0; i < books.length; i++)
			books[i].show();
	}
}