#include "stdio.h"

int main(int argc, char const *argv[])
{
    int max = 0;
    int min = 0;

    while (1)
    {
        if ((min - 1) > 0)
        {
            break;
        }
        min = min - 1;
    }

    while (1)
    {
        if ((max + 1) < 0)
        {
            break;
        }
        max = max + 1;
    }

    printf("Range of type(int) is [%d, %d]\n", min, max);

    return 0;
}
