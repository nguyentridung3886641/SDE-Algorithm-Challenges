#include <stdio.h>
#include <stdbool.h>

bool isPrime(int a){
    if(a < 2) return false;
    for (int i = 2; i * i <= a; ++i){
        if(a % i == 0)
            return false;
    }
    return true;
}

int main(){

    int n;
    scanf("%d", &n);
    int a[n];

    for (int i = 0; i < n; i++)
        scanf("%d", &a[i]);
    
    for (int i = 0; i < n; i++){
        if(isPrime(a[i]))
            printf("%d ", a[i]);
    }

    return 0;
}