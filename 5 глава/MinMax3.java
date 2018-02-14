/*
	Перепишите рассмотренный ранее класс MinMax таким образом, чтобы в нем использовалась
	разновидность for-each цикла for.
*/
	
class MinMax3{
		
	public static void main(String args[]) {
			
		int nums[] ={99, 10, 100123, 18, -978, 5623, 463, -9, 278, 49};
		int min, max;
		
		min = max = nums[0];
		
		for(int num : nums){
			if(num < min) min = num;
			if(num > max) max = num;
		}

		System.out.println("min и max: " + min + " " + max);
	}
}