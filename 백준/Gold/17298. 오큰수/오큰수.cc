#include <iostream>
#include <stack>

using namespace std;

int main() {
  int N;
  scanf("%d", &N);
  int *arr = new int[N];
  int *result = new int[N];
  stack <int> s;

  for(int i = 0; i<N; i++){
    scanf("%d", &arr[i]);
  }

  s.push(0);
  for(int i = 1; i<N; i++){
    while(!s.empty() && arr[s.top()] < arr[i]){
      result[s.top()] = arr[i];
      s.pop();
    }
    s.push(i);
  }

  while(!s.empty()){
    result[s.top()] = -1;
    s.pop();
  }
  
  for(int i = 0; i<N; i++){
    printf("%d ", result[i]);
  }

  delete [] result;
  delete [] arr;
  return 0;
}