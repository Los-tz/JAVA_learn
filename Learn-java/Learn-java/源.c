#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
int main()
{
	int beerNum = 10;
	char w[] = "bottles";

	while ( beerNum>0)
	{
		if (1 == beerNum)
		{
			char W[] = "bottle";
			printf("%d %s of beer on the wall\n", beerNum, W);
			printf("%d %s of beer.\n", beerNum, W);
			printf("Take one down.\n");
			printf("pass it around\n");
		}
		
			printf("%d %s of beer on the wall\n", beerNum, w);
			printf("%d %s of beer.\n", beerNum, w);
			printf("Take one down.\n");
			printf("pass it around\n");					
			beerNum = beerNum - 1;
		if (beerNum > 0)
		{
			printf("%d %s of beer on the wall\n", beerNum, w);
		}
		else
		{
			printf("No more bottles of beer on the wall");
		}	
	}
	return 0;
}