/*
	������� �������, ������������� ������������� ���������
*/

class Err {
	String msg; 	// ��������� �� ������
	int severity; 	// ������� ����������� ������
	
	Err(String m, int s) {
		msg = m;
		severity = s;
	}
}

class ErrorInfo {
	
	String msgs[] = {
		"������ ������",
		"������ �����",
		"����������� ����� �� �����",
		"����� ������� �� ������� ���������"
	};
	
	int howbad[] = { 3, 3, 2, 4 };
	
	Err getErrorinfo ( int i) {
		if(i >=0 & i < msgs.length)
			return new Err(msgs[i], howbad[i]);
		else
			return new Err("�������������� ��� ������", 0);
	}
}

class ErrInfo{
	
	public static void main(String args[]) {
		
		ErrorInfo err = new ErrorInfo();
		Err e;
		e = err.getErrorinfo(2);
		System.out.println(e.msg + " �������: " + e.severity);
		e = err.getErrorinfo(19);
		System.out.println(e.msg + " �������: " + e.severity);
	}
}
