#include <stdio.h>

int main()
{
    int price = 0;

    printf("Input price(CNY):");
    scanf("%d", &price);

    int change = 100 - price;

    printf("Change is %d CNY.\n", change);

    return 0;
}
