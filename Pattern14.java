/*

1
2 1
3 2 1
4 3 2 1
5 4 3 2 1


*/



import java.util.*;
class Pattern14
{
	public static void main(String[] args)
	{
	int i,j;
	
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=5;j++)
		{
			System.out.print(j + " ");
			for(j=i;j>=1;j--)
			{
				System.out.print(j + " ");
			}
		}
				
		System.out.println(); 
				
	}
	
	}
}
