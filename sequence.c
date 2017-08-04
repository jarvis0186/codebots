#include<stdio.h>
long int mod(long int);
long int n;
 long int i=1,sum=0,modu=0;
void main()
{
	scanf("%ld", &n);
	for(long int k=1; k<n; k++)
	{
		sum=sum+i;
		i=sum;
		 if(i>10)
		 {
		i=mod(i);
		}
		printf("bhu");	
	}
	
	printf("The %ld th value is %ld\n", n, sum);
}
long int mod(long int x)
{
	if(x!=0)
	{
		return(x%10+mod(x/10));
	}
}
		
	
