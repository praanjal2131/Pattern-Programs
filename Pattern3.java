/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5


*/



import java.util.*;
class Pattern3
{
	public static void main(String[] args)
	{
	int row=5;
	for(int i=1;i<=5;i++)
	{
		//System.out.print("\t"+i);
		
		for(int j=1;j<=i;j++)
		{
			
			//System.out.print(i + " ");
			for( i=row-1;i>=1;i--)
			{
				for( j=1;j<=i-1;j--)
			
				System.out.print(j + " ");
			}
			
		}
		  System.out.println();     
	
	}
	
	}
}
