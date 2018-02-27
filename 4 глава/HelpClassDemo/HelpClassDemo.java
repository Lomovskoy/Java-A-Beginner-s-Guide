/*
	“пражнение 4.1
	
	Џреобразование в класс Help справочной
	системы из упражнениЯ 3.3
*/

class Help{
	
	void helpon(int what){
		switch (what){
				case '1':
					System.out.println("Оператор if:\n");
					System.out.println("if(условие) оператор;");
					System.out.println("else оператор;");
					break;
				case '2':
					System.out.println("Оператор switch:\n");
					System.out.println("switch(выражение) {");
					System.out.println(" case (константа):");
					System.out.println("  последовательность операторов");
					System.out.println("  break;");
					System.out.println("  // ...");
					System.out.println("}");
					break;
				case '3':
					System.out.println("Оператор for:\n");
					System.out.println("for(инициализация; условие; операция)\n");
					System.out.println("Оператор;\n");
					break;
				case '4':
					System.out.println("Оператор while:\n");
					System.out.println("while(условие) оператор;\n");
					break;
				case '5':
					System.out.println("Оператор do-while:\n");
					System.out.println("do {\n");
					System.out.println(" Оператор;\n");
					System.out.println("} while (условие);\n");
					break;
				case '6':
					System.out.println("Оператор break:\n");
					System.out.println("break; или break метка;\n");
					break;
				case '7':
					System.out.println("Оператор continue:\n");
					System.out.println("continue; или continue метка;\n");
					break;
			}
		System.out.println();
	}
	
	void showmenu(){
		System.out.println(" Cпарвка: ");
		System.out.println(" 1. if");
		System.out.println(" 2. switch");
		System.out.println(" 3. for");
		System.out.println(" 4. while");
		System.out.println(" 5. do-while");
		System.out.println(" 6. break");
		System.out.println(" 7. continue");
		System.out.println("Выберите q для выхода: ");
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
	