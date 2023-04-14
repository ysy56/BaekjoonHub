#include <iostream>
#include <string>
#include <cmath>
using namespace std;

int main() {
  int A, B;

  while(true){
    cin >> A >> B;
    if(A>B){
      if(A%B == 0)
        cout<<"multiple"<<endl;
      else
        cout<<"neither"<<endl;
    }
    else if(A<B){
      if(B%A == 0)
        cout<<"factor"<<endl;
      else
        cout<<"neither"<<endl;
    }
    else
      break;
  }

  return 0;
}