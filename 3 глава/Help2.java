/*
	���������� 3.2
	
	����������� ���������� �������, � ������� ��� ���������
	����������� ������ �� ���� ������������ ���� do-while
*/

class Help2{
	public static void main(String args[]) throws java.io.IOException{
		
		char choice, ignore;
		do{
			System.out.println("�������: ");
			System.out.println(" 1. if");
			System.out.println(" 2. switch");
			System.out.println(" 3. for");
			System.out.println(" 4. while");
			System.out.println(" 5. do-while");
			System.out.println("��������: ");
			choice = (char) System.in.read();
			
			System.out.println("\n");
			
			do{
				ignore = (char) System.in.read();
			} while(ignore != '\n');
			
		} while(choice < '1' | choice > '5');
		
		System.out.println("\n");
		
		switch (choice){
			case '1':
				System.out.println("�������� if:\n");
				System.out.println("if(�������) ��������;");
				System.out.println("else ��������;");
				break;
			case '2':
				System.out.println("�������� switch:\n");
				System.out.println("switch(���������) {");
				System.out.println(" case (���������):");
				System.out.println("  ������������������ ����������");
				System.out.println("  break;");
				System.out.println("  // ...");
				System.out.println("}");
				break;
			case '3':
				System.out.println("�������� for:\n");
				System.out.println("for(�������������; �������; ��������)\n");
				System.out.println("��������;\n");
				break;
			case '4':
				System.out.println("�������� while:\n");
				System.out.println("while(�������) ��������;\n");
				break;
			case '5':
				System.out.println("�������� do-while:\n");
				System.out.println("do {\n");
				System.out.println(" ��������;\n");
				System.out.println("} while (�������);\n");
				break;
		}
	}
}
	