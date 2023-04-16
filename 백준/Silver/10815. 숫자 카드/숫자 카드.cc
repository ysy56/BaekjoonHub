#include <iostream>
#include <algorithm>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  int N, M;

  cin >> N;
  int arr1[N];
  for(int i = 0; i<N; i++){
    cin >> arr1[i];
  }
  
  sort(arr1, arr1+N);
  
  cin >> M;
  int arr2[M];
  int result[M];
  fill_n(result, M, 0);
  for(int i = 0; i<M; i++){
    cin >> arr2[i];

    int low = 0;
    int high = N-1;
    int mid;

    while(low <= high){
      mid = (low+high)/2;
      if(arr1[mid] == arr2[i]){
        result[i] = 1;
        break;
      }
      else if(arr1[mid] > arr2[i]){
        high = mid - 1;  
      }
      else{
        low = mid + 1;
      }
    }
  }

  for(int i = 0; i<M; i++){
    cout << result[i] << " ";
  }
  
  return 0;
}