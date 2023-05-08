#include <iostream>
#include <stack>
#include <vector>

using namespace std;

int main() {
  int N;
  
  scanf("%d", &N);
  int* arr = new int[N];
  stack<int> num;
  vector<string> result;

  int n = 1;

  for(int i = 0; i<N; i++){
    scanf("%d", &arr[i]);
    if(arr[i] >= n){
      while(arr[i] >= n){
        num.push(n);
        result.push_back("+");
        n++;
      }
      num.pop();
      result.push_back("-");
    }
    else{
      if(!num.empty() && num.top() == arr[i]){
        num.pop();
        result.push_back("-");
      }
      else{
        printf("NO\n");
        return 0;
      }
    }
  }
  
  for(int i = 0; i < result.size(); i++){ 
    printf("%s\n", result[i].c_str());
  }    

  delete[] arr;
  
  return 0;
}
