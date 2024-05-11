
public class application {
	
	public static void main(String[] args)
	{
		Solution solution = new Solution();
		
		int[] array = {12,1,42};
		
		
		
		long sum = solution.maximumHappinessSum(array, 3);
		
		System.out.print(sum);
	}

}
