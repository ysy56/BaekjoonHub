#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  int N;
  cin >> N;

  if(N == 1)
    cout << 0;
  else if(N == 2)
    cout << N;
  else
    cout << N * (N-1);
  
  return 0;
}