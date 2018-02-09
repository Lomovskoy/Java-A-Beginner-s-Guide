/*
	Пропуск отдельных составляющик в цикле for
*/

class Empty{
	public static void main(String args[]) throws java.io.IOException{
		int i;

		for(i = 0; i < 10; ){
			System.out.println("Проход №" + i);
			i++;
		}
		
	}
}
	