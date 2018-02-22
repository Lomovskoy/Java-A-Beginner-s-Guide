/*
	ʊ���� ����������� ������ bookpackext
*/
package bookpackext2;

//������ ������������� ������������ protected
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
	
	//��������� ��������� ���������, ��������� ��������� �����
	//����� ������� � ������ ������, ����������� �����������
	public String gerTitle(){return title;}
	public void setTitile(String t){title = t;}
	public String getAutor(){return autor;}
	public void setAutor(String a){autor = a;}
	public int getPubDate(){return pubDate;}
	public void setPubDate(int d){pubDate = d;}
	
}



public class UseBook{
	
	public static void main(String args[]) {
		//����� ������ ������������� ������ ������������ ��� ��� ������
		ExtBook books[] = new ExtBook[5];
		
		books[0] = new ExtBook(
			"Java: ����������� ��� ����������", "�����", 2015, "����������");
		books[1] = new ExtBook(
			"Java: ������ �����������", "�����", 2015, "����������");
		books[2] = new ExtBook(
			"Java: ��������� ����������������", "����� � �����", 2003, "����������");
		books[3] = new ExtBook(
			"Java: ��������� � ��������� ������", "�������", 2013, "����������");
		books[4] = new ExtBook(
			"Java: ����������� ����������������", "����", 2014, "����������");
		
		for(int i=0; i < books.length; i++)
			books[i].show();
		
		//����� ���� �� ������
		System.out.println("����� ���� �� ������: ����");
		for(int i=0; i < books.length; i++)
			if(books[i].getAutor()=="�����")
				System.out.println(books[i].gerTitle());
			
		//books[0].title = "�������� ���������"; // ������ �������
	}
}