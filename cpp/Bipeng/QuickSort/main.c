// quickSort.cpp: 定义控制台应用程序的入口点。
//

// #include "stdafx.h"
#include "stdio.h"
int a[101], n;

void quickSort(int left, int right)
{
	int i, j, t, temp;
	if (left > right)
	{
		return;
	}

	temp = a[left];
	i = left;
	j = right;
	while (i != j)
	{
		while (a[j] >= temp && i < j)
		{
			j--;
		}
		while (a[i] <= temp && i < j)
		{
			i++;
		}
		if (i < j)
		{
			t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
		a[left] = a[i];
		a[i] = temp;

		quickSort(left, i + 1);
		quickSort(i + 1, right);
		return;
	}
}

int main()
{
	int i;
	scanf("%d", &n);
	for (i = 1; i <= n; i++)
	{
		scanf("%d", &a[i]);
	}
	quickSort(1, n);
	for (i = 1; i <= n; i++)
	{
		printf("%d ", a[i]);
	}
	return 0;
}
