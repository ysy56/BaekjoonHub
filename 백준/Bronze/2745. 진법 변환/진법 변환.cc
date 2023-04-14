#include <iostream>
#include <string>
#include <cmath>
using namespace std;

int main() {
  string N;
  int B;
  int result = 0;

  cin >> N >> B;

  for(int i = 0; i < N.length(); i++){
    double tmp = 0;
    if(N[i] < 'A'){
      tmp = N[i] - '0';
      //cout << tmp << endl;
    }
    else{
      tmp = N[i] - 'A' + 10;
      //cout << tmp << endl;
    }

    result = result + pow(B, N.length()-i-1) * tmp;
  }
  cout<< result;

  return 0;
}