#include <stdio.h>

void IncreaseArray(int *a, int a_count){
    for (int i = 0; i < a_count - 1; i++){
        int pos = i;
        for(int j = i + 1; j < a_count; j++){
            if(a[pos] >a[j])
                pos = j;
        }
        int temp = a[i];
        a[i] = a[pos];
        a[pos] = temp;
    }
}

int main() {

    int n;
    scanf("%d", &n);
    int a[n];

    for (int i = 0; i < n; i++)
        scanf("%d" , &a[i]);

    IncreaseArray(a, n);

    for (int i = 0; i < n; i++)
        printf("%d ", a[i]);

    return 0;
}