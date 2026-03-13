#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    char ch[3], s[50], se[100];
    
    fgets(ch, 3, stdin);
    fgets(s, 50, stdin);
    fgets(se, 100, stdin);

    printf("%c\n", ch[0]);
    printf("%s", s);
    printf("%s", se);
    
    return 0;
}