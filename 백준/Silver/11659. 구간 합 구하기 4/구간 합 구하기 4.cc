#include <cstdio>
#include <vector>
using namespace std;

int main() {
    int N, M;
  
    scanf("%d %d", &N, &M);
    int tmp;
    vector<int> arr2(N);
    vector<int> result(M);

    for(int i = 0; i < N; i++){
        scanf("%d", &tmp);
        if(i == 0)
            arr2[i] = tmp;
        else
            arr2[i] = arr2[i-1] + tmp;
    }

    for(int i = 0; i < M; i++){
        int a, b;
        scanf("%d %d", &a, &b);
        result[i] = arr2[b-1] - (a > 1 ? arr2[a-2] : 0);
    }
    for(int i = 0; i < M; i++){
        printf("%d\n", result[i]);
    }
  
    return 0;
}
