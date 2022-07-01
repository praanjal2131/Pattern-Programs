/*
1
2 7
3 8 13
4 9 14 19
5 10 15 20 25


*/



import java.util.*;
class Pattern12
{
	public static void main(String[] args)
	{
	int i,j;
	for(i=1;i<=5;i++)
	{
		int k=i;
		for(j=i;j>=1;j--)
		{
		
					
			System.out.print(k+" ");
			k=k+5;
		}
				
		System.out.println(); 
		
	}
	}
}
