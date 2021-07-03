#include <stdio.h>

int main(int argc, char **argv)
{
    int tmp_0 = 0;
    int tmp_1 = 0;
    int tmp_2 = 0;
    int tmp_3 = 0;
    int tmp_4 = 0;

    scanf("%d", &tmp_0);

    tmp_1 = tmp_0 / 100;
    tmp_2 = (tmp_0 / 10) % 10;
    tmp_3 = tmp_0 % 10;
    tmp_4 = tmp_3 * 100 + tmp_2 * 10 + tmp_1;

    printf("%d", tmp_4);

    return 0;
}