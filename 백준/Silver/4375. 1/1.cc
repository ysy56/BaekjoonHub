#include <iostream>
using namespace std;

int main() {
  long n;
  long digit = 1;
  long result = 1;
  
  while(cin >> n){
    digit = 1;
    result = 1;
    while(digit % n){
      if(digit == 0)
        break;
      digit = (digit * 10)%n + 1%n;
      result++;
    }
    cout << result << endl;
  }
  
}