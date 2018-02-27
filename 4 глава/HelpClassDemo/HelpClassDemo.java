/*
	���������� 4.1
	
	�������������� � ����� Help ����������
	������� �� ���������� 3.3
*/

class Help{
	
	void helpon(int what){
		switch (what){
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
				case '6':
					System.out.println("�������� break:\n");
					System.out.println("break; ��� break �����;\n");
					break;
				case '7':
					System.out.println("�������� continue:\n");
					System.out.println("continue; ��� continue �����;\n");
					break;
			}
		System.out.println();
	}
	
	void showmenu(){
		System.out.println(" C������: ");
		System.out.println(" 1. if");
		System.out.println(" 2. switch");
		System.out.println(" 3. for");
		System.out.println(" 4. while");
		System.out.println(" 5. do-while");
		System.out.println(" 6. break");
		System.out.println(" 7. continue");
		System.out.println("�������� q ��� ������: ");
	}
	
	boolean isvalid(int ch){
		if(ch < '1' | ch > '7' & ch != 'q') return true;
		else return false;
	}
}

class HelpClassDemo{
	public static void main(String args[]) throws java.io.IOException{
		
		char choice, ignore;
		Help help = new Help();
		
		for(;;){
			do{
				help.showmenu();
				choice = (char) System.in.read();
				
				do{
					ignore = (char) System.in.read();
				}while(ignore != '\n');
				
			}while(!help.isvalid(choice));
			
			if(choice == 'q') break;
			
			System.out.println("\n");
			help.helpon(choice);
		}
	}
}
	