/*
	��������� �������� ��� ��������
*/
	
class StringOps{
		
	public static void main(String args[]) {
			
		//��������� ������� ���������� �����
		String str1 = "Java - ����� ���������";
		String str2 = new String(str1);
		String str3 = "������ � Java ����������.";
		int result, idx;
		char ch;
		
		System.out.println("������ ������ str1: " + str1.length());
		
		//���������� ������ str1 �����������
		for(int i =0; i < str1.length(); i++)
			System.out.print(str1.charAt(i));
		System.out.println();
		
		if(str1.equals(str2))
			System.out.println("str1 ������������ str2");
		else
			System.out.println("str1 �� ������������ str2");
		
		if(str2.equals(str3))
			System.out.println("str2 ������������ str3");
		else
			System.out.println("str2 �� ������������ str3");
		
		result = str1.compareTo(str3);
		
		if(result == 0)
			System.out.println("str1 � str3 �����");
		else if(result < 0)
			System.out.println("str1 ������ str3");
		else
			System.out.println("str1 ������ str3");
		
		//��������� ���������� str2 ����� ������
		str2 = "One ��� ��� ������";
		
		idx = str2.indexOf("One");
		System.out.println("������ ������� �������� ���: " + idx);
		idx = str2.lastIndexOf("One");
		System.out.println("������ ���������� �������� ���: " + idx);
	}
}