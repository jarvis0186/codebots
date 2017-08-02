#include<stdio.h>

void main()
{
	int n, sum=0;
	scanf("%d", &n); 
	
	for(int i=1; i<n; i++)
		{
			if((i%3)==0 || (i%5)==0)
			{
				printf("%d\n", i);
			    sum+=i;
			  }
		}
		
	printf("The sum is: %d\n", sum);
}
