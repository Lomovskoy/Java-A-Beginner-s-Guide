/*
	���������� ��������� ����� final � ���������� ����������
*/

//������� ������� ���� String
class ErrorMsg{
	//���� ������
	//��������� ����������� � ������� ��������� ����� final
	final int OUTERR = 0;
	final int INERR = 1;
	final int DISKERR = 2;
	final int INDEXERR = 3;
	
	String msgs[] = {
		"������ ������",
		"������ �����",
		"����������� ����� �� �����",
		"����� ������� �� ������� ���������"
	};
	
	//���������� ��������� �� ������
	String getErrorMsg(int i){
		if(i >= 0 & i < msgs.length)
			return msgs[i];
		else
			return "�������������� ��� ������";

	}
}

class FinalD{
	
	public static void main(String args[]) {
		
		ErrorMsg err = new ErrorMsg();
		
		//��� ������ ������ ������������ ���������,
		//����������� � ������� ��������� ����� final
		System.out.println(err.getErrorMsg(err.OUTERR));
		System.out.println(err.getErrorMsg(err.DISKERR));
	}
}