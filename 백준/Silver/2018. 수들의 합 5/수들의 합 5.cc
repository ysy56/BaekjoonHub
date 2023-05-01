#include <iostream>

using namespace std;

int main() {
  int N;
  
  scanf("%d", &N);

  int sum = 1;
  int count = 1;
  int start_idx = 1;
  int end_idx = 1;

  while(end_idx != N){
    if(sum == N){
      count++;
      end_idx++;
      sum = (start_idx+end_idx) * (end_idx-start_idx+1) / 2;
    }
    else if(sum > N){
      start_idx++;
      sum = (start_idx+end_idx) * (end_idx-start_idx+1) / 2;
    }
    else if(sum < N){
      end_idx++;
      sum = (start_idx+end_idx) * (end_idx-start_idx+1) / 2;
    }
  }

  printf("%d", count);
  
  return 0;
}