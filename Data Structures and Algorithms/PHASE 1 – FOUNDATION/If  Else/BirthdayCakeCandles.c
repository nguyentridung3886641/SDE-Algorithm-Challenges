#include <assert.h>
#include <ctype.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int birthdayCakeCandles(int candles_count, int* candles) {
    int tallest = candles[0], count = 1;
    for (int i = 1; i < candles_count; i++){
        if (tallest < candles[i]){    
            tallest = candles[i];
            count = 1;
        }
        else if (tallest == candles[i])
            ++count;
    }
    return count;
}

int main(){

    int n;
    scanf("%d", &n);
    int a[n];

    for (int i = 0; i < n; i++)
        scanf("%d", &a[i]);

    printf("%d", birthdayCakeCandles(n, a));

    return 0;
}