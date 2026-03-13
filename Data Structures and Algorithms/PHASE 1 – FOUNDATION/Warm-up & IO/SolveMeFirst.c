#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>
#include <string.h>

typedef long long ll;

ll min(ll a, ll b) {
    return (a < b) ? a : b;
}

ll max(ll a, ll b) {
    return (a > b) ? a : b;
}

ll gcd(ll a, ll b) {
    while (b != 0) {
        ll r = a % b;
        a = b;
        b = r;
    }
    return a;
}

ll lcm(ll a, ll b) {
    return a / gcd(a, b) * b;
}

bool isPrime(ll n) {
    if (n < 2) return false;
    for (ll i = 2; i * i <= n; i++)
        if (n % i == 0)
            return false;
    return true;
}

ll factorial(int n) {
    ll res = 1;
    for (int i = 1; i <= n; i++)
        res *= i;
    return res;
}

ll ReverseNumber(ll n) {
    ll temp = 0;
    while(n){
        temp = temp * 10 + n % 10;
        n /= 10;
    }
    return temp;
}

int solveMeFirst(int a, int b){
    return a + b;
}

int main() {

    int a, b;
    scanf("%d%d", &a, &b);
    printf("%d", solveMeFirst(a, b));

    return 0;
}
