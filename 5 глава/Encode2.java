/*
	��������� ����� Encode ����� �������, ����� � �������� ����� 
	���������� �������������� ������ �� ������ ��������.
*/
	
class Encode2{
		
	public static void main(String args[]) {
			
		String msg = "��� �������� ���������";
		String encmsg = "";
		String decmsg = "";
		char keyArr[] = {'a','C','t','K','A','J','L','M'};
		int key = 0;
		
		for(char ch : keyArr)
			key += ch;
		
		System.out.print("�������� ���������: ");
		System.out.println(msg);
		
		//����������� ���������
		for(int i=0; i < msg.length(); i++)
			//���������� ������������� ������� ���������
			encmsg += (char) (msg.charAt(i) ^ key);
			
		System.out.print("������������� ���������: ");
		System.out.println(encmsg);
		
		//����������� ���������
		for(int i = 0; i < msg.length(); i++)
			//���������� ������������� ������� ���������
			decmsg += (char) (encmsg.charAt(i) ^ key);
			
		System.out.print("������������� ���������: ");
		System.out.println(decmsg);
	}
}