/*
	������������� ����� ��� ���������� ���������� switch
*/
	
class StringSwitch{
		
	public static void main(String args[]) {
			
		String command = "cansel";
		
		switch(command){
			case "connect":
				System.out.println("�����������.");
				break;
			case "cansel":
				System.out.println("������.");
				break;
			case "disconnect":
				System.out.println("����������.");
				break;
			default:
				System.out.println("���������������.");
				break;
		}
		
	}
}