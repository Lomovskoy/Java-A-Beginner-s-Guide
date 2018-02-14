/*
	Измените программу, написанную в упражнении 5.1, таким образом, чтобы она
	сортировала массив символьных строк. Продемонстрируйте ее работоспособность.
*/
	
class Bubble2{
		
	public static void main(String args[]) {
			
		char nums[] ={'c', 'b', 'a', 'd', 'f', 
					'i', 'g', 'h', 'x', 'w'};
		char t;
		//ќтобразить исходный массив
		System.out.print("Исходный массив: ");
		for(int i = 0; i < nums.length; i++)
			System.out.print(" " + nums[i]);
		System.out.println();
		
		//–еализовать алгоритм пузырьковой сортировки
		for(int a = 1; a < nums.length; a++)
			for(int b = nums.length - 1; b >= a; b--){
				//если требуемый пор€док следовани€ не соблюдаетс€,
				//помен€ть элементы местами
				if(nums[b-1] > nums[b]){
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
				}
			}
		
		//ќтобразить отсортированный массив
		System.out.print("ќтсортированный массив: ");
		for(int i = 0; i < nums.length; i++)
			System.out.print(" " + nums[i]);
		System.out.println();
	}
}