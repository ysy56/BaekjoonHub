#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  int T; 

  cin >> T;
  int arr[T][2];
  
  for(int i = 0; i<T; i++){
    cin >> arr[i][0] >> arr[i][1];
  }
  
  for(int i = 0; i<T; i++){
    int n = 1;
    if(arr[i][0] == 1 || arr[i][1] == 1){
      cout << arr[i][0] * arr[i][1] << endl;
      continue;
    }
    while(true){
      if(arr[i][0] > arr[i][1]){
        if(((arr[i][1] * n)%arr[i][0]) == 0){
          cout << arr[i][1] * n << endl;
          break;
        }
      }
      else if(arr[i][0] < arr[i][1]){
        if(((arr[i][0] * n)%arr[i][1]) == 0){
          cout << arr[i][0] * n << endl;
          break;
        }
      }
      else{
        cout << arr[i][0] << endl;
        break;
      }
      n++;
    }
    
  }
  
  return 0;
}