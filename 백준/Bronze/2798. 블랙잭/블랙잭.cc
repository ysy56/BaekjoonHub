#include <iostream>
using namespace std;

int main() {
  int N, M;
  long idx = 0;
  
  cin >> N >> M;
  long arr[N];
  long result = 0;
  
  for(int i = 0; i<N; i++){
    cin >> arr[i];
  }
  
  for(int i = 0; i<N-2; i++){
    for(int j = i+1; j<N-1; j++){
      for(int k = j+1; k<N; k++){
        int tmp = arr[i] + arr[j] + arr[k];
        if(tmp <= M && result < tmp){
          result = tmp;
        }
      }
    }
  }
  
  cout << result;
  
  return 0;
}