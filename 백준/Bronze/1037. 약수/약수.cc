#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  int N;
  
  cin >> N;
  int arr[N];
  for(int i=0;i<N;i++){
    cin >> arr[i];
  }

  sort(arr, arr+N);

  cout << arr[0] * arr[N-1];
   
  return 0;
}