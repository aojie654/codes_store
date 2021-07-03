#include <stdio.h>

int n=5, m=5, p=5, q=4, min = 99999999;
int a[51][51] = {{0, 1, 0, 0, 0},
               {0, 0, 0, 1, 0},
               {1, 0, 0, 0, 1},
               {0, 1, 0, 1, 0},
               {0, 0, 0, 0, 0}},
        book[51][51];

void dfs(int x, int y, int step)
{
    int next[4][2] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int tx, ty, k;
    if (x == p && y == q)
    {
        if (step < min)
        {
            min = step;
        }
        return;
    }
    for (k = 0; k <= 3; k++)
    {
        tx = x + next[k][0];
        ty = y + next[k][1];
        if (tx < 0 || tx > n || ty < 0 || ty > m)
        {
            continue;
        }
        if (a[tx][ty] == 0 && book[tx][ty] == 0)
        {
            book[tx][ty] = 1;
            dfs(tx, ty, step + 1);
            book[tx][ty] = 0;
        }
    }
    return;
}

int main()
{
    int i=0, j=0, startx=0, starty=0;
    startx = 0;
    starty = 0;
    book[startx][starty] = 1;
    dfs(startx, starty, 0);
    printf("The minimal step is %d", min);
    return 0;
}
