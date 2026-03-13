#include <stdio.h>
typedef long long ll;

void miniMaxSum(int arr_count, int* arr) {
    long long total = 0;
    long long min = arr[0];
    long long max = arr[0];

    for (int i = 0; i < arr_count; i++) {
        total += arr[i];

        if (arr[i] < min)
            min = arr[i];

        if (arr[i] > max)
            max = arr[i];
    }

    printf("%lld %lld", total - max, total - min);
}

int main(){

    int n;
    scanf("%d", &n);
    int a[n];

    for (int i = 0; i < n; i++)
        scanf("%d", &a[i]);
    
    miniMaxSum(n, a);

    return 0;
}