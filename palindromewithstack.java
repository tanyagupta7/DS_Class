package data;

public class palindromewithstack {
	public static boolean Palindrome(String p )
	{
		Stack stack = new Stack();
		
		int n = p.length();
		
		int i=0;
		int mid=n/2;
		
		for(i=0;i<mid;i++)
		{
			stack.push(p.charAt(i));
		}
		
		if(n%2!=0)
		{
			i++;
		}
		
		while(i<n)
		{
			char d = stack.pop();
			
			if(d!=p.charAt(i))
			{
				return false;
			}
			i++;
		}
		
		return true;
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		String p="temp";
		
		if(Palindrome(p))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		
	}

}
